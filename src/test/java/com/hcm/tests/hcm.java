package com.hcm.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class hcm extends hcm_base{
	
	public WebDriver driver;
	
	@Test
	public void addreportmangager() throws InterruptedException, IOException {
		
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
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
		
		for (int i = 5; i <= allrows.size() ; i++) {
		WebElement empcodelnk = driver.findElement(By.xpath("//*[@id=\"allEmployeesList\"]/tbody/tr["+i+"]/td[1]/a"));
		String web_empcode = empcodelnk.getText();
		Reporter.log("web empcode:"+web_empcode,true);
		empcodelnk.click();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath(reportingmanagerpath))).click().pause(2000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(addnewbuttonpath))).click().pause(2000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(reportingtypepath))).click().pause(1000).sendKeys("re").pause(1000).sendKeys(Keys.ENTER).build().perform();
		act.moveToElement(driver.findElement(By.xpath(employeecodepath))).click().pause(1000).sendKeys("2000").sendKeys(Keys.ENTER).build().perform();
		act.moveToElement(driver.findElement(By.xpath(effectivedatepath))).click().pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(date19path))).click().pause(3000).build().perform();
		if(driver.findElement(By.id("reportingform")).findElement(By.id("btnsave")).isDisplayed()&&driver.findElement(By.id("reportingform")).findElement(By.id("btnsave")).isEnabled())
		{
			
			driver.findElement(By.id("reportingform")).findElement(By.id("btnsave")).click();
			Thread.sleep(2000);
		}
		else {
			Reporter.log("Save Button is not visibled or enabled",true);
		}
		
		act.moveToElement(driver.findElement(By.xpath(yesbuttonpopuppath))).click().pause(2000).build().perform();
		
		Thread.sleep(5000);
		System.out.println("Save button clicked: "+web_empcode);
		driver.get(hrisfoundationurl);
		Thread.sleep(2000);
		Select sel1 = new Select(driver.findElement(By.xpath(showentriespath)));
		sel1.selectByVisibleText("All");
		Thread.sleep(4000);
		
		
		
		}

				
	}
		
		

	
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

	

}
