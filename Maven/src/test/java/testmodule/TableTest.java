package testmodule;

import java.util.ArrayList;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {

	@Test
	public void Table() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		driver.get("https://www.goibibo.com/trains/gowthami-sf-express-12738/");
		System.out.println(driver.getTitle());
	//System.out.println(driver.findElement(By.xpath("//html//tr[*]/td[5]/span")).getText().contains("02:00"));
	 int count = driver.findElements(By.xpath("//html//tr[*]/td[5]/span")).size();
	 System.out.println("Row count "+count);
	
	 //String list1;
	 ArrayList<String> Timelist = new ArrayList<String>(21);
	for (int i=0;i<count;i++) {
	 //list1=driver.findElements(By.cssSelector("span.train-halt")).get(i).getText();
	 Timelist.add(driver.findElements(By.cssSelector("span.train-halt")).get(i).getText());
	 //System.out.println(list1);
	 //System.out.println(arrlist1);
	}
	System.out.println("Halt Times: "+Timelist);
	//String list2;
	ArrayList<String> Haltlist = new ArrayList<String>(21);
	 for (int i=0;i<count;i++) {
	 //list2=driver.findElements(By.cssSelector("span.train-name.train-name-truncate")).get(i).getText();
		 //ArrayList<String> arrlist = new ArrayList<String>(21);
	 //ArrayList <String> li2[]=driver.findElements(By.cssSelector("span.train-name.train-name-truncate")).get(i).getText();
		 Haltlist.add(driver.findElements(By.cssSelector("span.train-name.train-name-truncate")).get(i).getText());
	 //System.out.println(list2);
	 //System.out.println(arrlist);
	  }
	 System.out.println("Total junctions: "+Haltlist);
	 
	 String st="";
	 ArrayList<String> HaltStations=new ArrayList<String>(21);
	for (int i=0;i<count;i++) {
		 
		 if(Timelist.get(i).equalsIgnoreCase("2")) {
			st=st+", "+Haltlist.get(i);
			HaltStations.add(Haltlist.get(i));
			//System.out.print("\n");
			
		 }
			 
		 
	 }
	System.out.println("Junctions train will halts for 2 minutes: "+st);
	 //HashMap<String, String> hm=new HashMap<String,String>();
	System.out.println("Junctions train will halts for 2 minutes Array List: "+HaltStations);
	System.out.println("Count of junctions matched to given condition: "+HaltStations.size());
	 

	 
	 driver.close();
	 
	
	}
	
}
