package testmodule;

import org.testng.annotations.Test;

public class RestapiTest {

	
	@Test
	public void PostData() 
	{
		
	System.out.println("This is a PostData");	
		
	}
	
	
	@Test
	public void RetriveData() 
	{
		
	System.out.println("This is a RetriveData");	
		
	}
	
	@Test
	public void Arithmetic() 
	{
	int a =5;
	int b=0;
	int c=a/b;
		
	System.out.println("Arithmetic value is"+c);	
		
	}
	
	
}
