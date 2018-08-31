package com.hcm.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hcm.base.hcm_base;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class shift extends hcm_base{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void init()
	{
		System.setProperty(chromedriver, chromepath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		Reporter.log("Test Ended Successfully", true);
		driver.quit();
	}
	
	@Test(dataProvider="performshiftreg")
	public void shiftreg(String shiftname, String shortname, String colorcode) throws InterruptedException {
		
		driver.get(appurl);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(usrnamepath))).click().pause(1000).sendKeys(username).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(passwrdpath))).click().pause(1000).sendKeys(password).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(signinbuttonpath))).click().pause(1000).build().perform();
		
		driver.get(shiftmasterurl);
		Thread.sleep(2000);
		
		
		act.moveToElement(driver.findElement(By.xpath(addnewpath))).click().pause(2000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(shiftnamepath))).click().pause(1000).sendKeys(shiftname).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(shortnamepath))).click().pause(1000).sendKeys(shortname).pause(1000).build().perform();
		driver.findElement(By.xpath(colorpath)).click();
		driver.findElement(By.xpath(colorpath)).clear();
		act.moveToElement(driver.findElement(By.xpath(colorpath))).sendKeys(colorcode).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(statuslablepath))).click().pause(1000).build().perform();
		Select sel = new Select(driver.findElement(By.xpath(statuspath)));
		sel.selectByValue("Active");
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath(descriptionpath))).click().pause(1000).sendKeys("test").pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(savebuttonatshiftpath))).click().pause(3000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(yesbuttonatshiftpath))).click().pause(2000).build().perform();
		Thread.sleep(1000);
		
	
	}
	
	@DataProvider	
	public Object[][] performshiftreg() throws BiffException, IOException
	{
		Object[][] exdata = getExcelData();
		return exdata;
	}
		
	public Object[][] getExcelData() throws BiffException, IOException
	{
		FileInputStream fi = new FileInputStream("D:\\Projects\\HCM\\workspace_hcm\\HCM\\src\\main\\java\\com\\hcm\\files\\hcm_shift_data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet sht = wb.getSheet("inputdata");
		String[][] exceldata = new String[sht.getRows()][sht.getColumns()];
		for (int i = 0; i < sht.getRows(); i++) {
			for (int j = 0; j < sht.getColumns(); j++) {
				exceldata[i][j] = sht.getCell(j, i).getContents();
			}
		}
		
		return exceldata;
		
	}

}
