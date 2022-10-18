package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test(invocationCount=4)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority=-1, invocationCount=3,enabled=false)
	public void settings()
	{
		Reporter.log("setting",true);
	}
	
	
	@Test(priority=-1)
	public void chats()
	{
		Reporter.log("Chats",true);
	}
}
