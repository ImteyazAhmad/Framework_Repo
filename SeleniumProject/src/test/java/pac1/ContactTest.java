package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContectTest()
	{
		String Url=System.getProperty("url");
		String Browser=System.getProperty("browser");
		String Username=System.getProperty("username");
		String Password=System.getProperty("password");
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		
		System.out.println(" execute createContectTest");
	}
	
	@Test
	public void modifyContectTest()
	{
		System.out.println(" execute modifyContectTest");
	}

}
