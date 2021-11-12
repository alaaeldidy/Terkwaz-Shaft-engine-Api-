package pages;

import com.shaft.api.RestActions;

public class Commanpage {

	
	public RestActions apiobject;
	public static final String baseurl=System.getProperty("Base_url");
	public static final int success=200;
	
	public Commanpage(RestActions apiobject)
	{
		this.apiobject=apiobject;
	}
	
	
	
	
	
	
	
}
