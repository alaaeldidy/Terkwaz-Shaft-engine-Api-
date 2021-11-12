package pages;


import java.util.Arrays;
import java.util.List;
import com.shaft.api.RestActions;
import com.shaft.api.RestActions.ParametersType;
import com.shaft.api.RestActions.RequestType;
import io.restassured.response.Response;


public class Allfunctions {

	private RestActions apiobject;
	
	public Allfunctions(RestActions apiobject)
	{
		this.apiobject=apiobject;
	}
	
//getcatfact
	public Response usercatfact()
	{
		
	
		
		  List<List<Object>> parameters =
		  Arrays.asList(Arrays.asList("animal_type","cat"), Arrays.asList("amount","1"));
		  
			
			
			  return
			  apiobject.buildNewRequest("/facts/random",RequestType.GET).setParameters(
					  parameters,ParametersType.QUERY).performRequest();
			
}
}