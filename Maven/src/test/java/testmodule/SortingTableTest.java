package testmodule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTableTest {

	@Test
	public void tabletest() {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E://drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.cleartrip.com/trains/12738/");
	ArrayList<String> obtainedList=new ArrayList<String>();
	List <WebElement> lis=driver.findElements(By.xpath("//tr/td[2]"));
	for (WebElement we:lis) {
	obtainedList.add(we.getText());

	}
	System.out.println(obtainedList);
	//System.out.println(lis);

	ArrayList<String> sortedList=new ArrayList<String>();

	for (String s:obtainedList)
	{
	sortedList.add(s); 

	}
	Collections.sort(sortedList);

	Assert.assertTrue(sortedList.equals(obtainedList));

	System.out.println(sortedList);


	driver.quit();
	}
}
