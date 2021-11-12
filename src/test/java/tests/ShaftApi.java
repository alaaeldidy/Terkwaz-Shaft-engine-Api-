package tests;

import static org.testng.Assert.assertNotNull;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.restassured.response.Response;
import pages.Allfunctions;
import pages.Commanpage;


public class ShaftApi {

	
	
	private RestActions apiobject ;		
	public Commanpage Commansobj;
	public Allfunctions Allfunctionsobj;
	
	@BeforeClass	
	public void openurl()
	{
	 apiobject=DriverFactory.getAPIDriver(Commanpage.baseurl);
	 Commansobj=new Commanpage(apiobject);
	 Allfunctionsobj =new Allfunctions(apiobject);
	}
	
	@Test
	public void usergetcatfactrandomly() throws IOException
	{
		Response getcatfact=  Allfunctionsobj.usercatfact();
		
		String body= RestActions.getResponseBody(getcatfact).toString();
		 
		 
		    @SuppressWarnings("unused")
			File fileObj = new File("reponsedata.json");
			FileWriter myWriter = new FileWriter("reponsedata.json");
			myWriter.write(body);
			myWriter.close();
		 
		
	    String rewsponsetext =RestActions.getResponseJSONValue(getcatfact,"text");
		assertNotNull(rewsponsetext);
	}
	
	
	
	
	
	
	
	
	
}
