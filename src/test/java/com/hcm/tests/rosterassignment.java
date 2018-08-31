package com.hcm.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hcm.base.hcm_base;

public class rosterassignment extends hcm_base{
	
	public WebDriver driver;

	@BeforeTest
	public void init()
	{
		System.setProperty(chromedriver, chromepath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		Reporter.log("Test Completed Successfully", true);
		driver.quit();
	}

	@Test
	public void rosterassign() throws InterruptedException
	{
		driver.get(appurl);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(usrnamepath))).click().pause(1000).sendKeys(username).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(passwrdpath))).click().pause(1000).sendKeys(password).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(signinbuttonpath))).click().pause(1000).build().perform();
		
		driver.get(hrisfoundationurl);
		Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.xpath(showentriespath)));
		sel.selectByVisibleText("All");
		Thread.sleep(4000);
		
		List<WebElement> allrows = driver.findElement(By.xpath(webtablepath)).findElements(By.tagName("tr"));
		System.out.println("Total Rows are: "+allrows.size());
		for (int i = 3; i <= 500 ; i++) {
			
		WebElement empcodelnk = driver.findElement(By.xpath("//*[@id=\"allEmployeesList\"]/tbody/tr["+i+"]/td[1]/a"));
		String web_empcode = empcodelnk.getText();
		Reporter.log("web empcode:"+web_empcode,true);
		empcodelnk.click();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath(fixedrosterpath))).click().pause(2000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(addnewbuttonpathatfixedroster))).click().pause(2000).build().perform();
		
		Select rosterrequired = new Select(driver.findElement(By.xpath(rosterrequiredpath)));
		rosterrequired.selectByValue("Yes");
		Thread.sleep(1000);
		
		
		act.moveToElement(driver.findElement(By.xpath(effectivedateatrosterpath))).click().pause(1000).build().perform();

		System.out.println("date field clicked");
		act.moveToElement(driver.findElement(By.xpath(date21path))).click().pause(1000).build().perform();
		System.out.println("date button clicked");
		//act.moveToElement(driver.findElement(By.xpath(savebuttonatrosterpath))).click().pause(3000).build().perform();
		//act.moveToElement(driver.findElement(By.xpath(yesbuttonatrosterpath))).click().pause(2000).build().perform();
		//Thread.sleep(4000);
		//System.out.println("Save button clicked at: "+web_empcode);
		driver.get(hrisfoundationurl);
		Thread.sleep(2000);
		Select sel1 = new Select(driver.findElement(By.xpath(showentriespath)));
		sel1.selectByVisibleText("All");
		Thread.sleep(4000);
		
		}
	}
	
}
