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

public class shiftparamerter extends hcm_base{

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
	
	
	@Test(dataProvider="performshiftparamreg")
	public void shiftparamenter(String shiftdata, String starttime, String endtime, String maxcutintime, String maxcutouttime, String graceinitime, String graceouttime, String breakstarttime1, String breakendtime1, String breakstarttime2, String breakendtime2, String breakstarttime3, String breakendtime3,String breakstarttime4,String breakendtime4) throws InterruptedException
	{
		driver.get(appurl);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(usrnamepath))).click().pause(1000).sendKeys(username).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(passwrdpath))).click().pause(1000).sendKeys(password).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(signinbuttonpath))).click().pause(1000).build().perform();
		
		driver.get(shiftparamerterurl);
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath(addnewatshiftparampath))).click().pause(2000).build().perform();
		
		Select shiftname = new Select(driver.findElement(By.xpath(shiftnameatparampath)));
		shiftname.selectByVisibleText(shiftdata);
		Thread.sleep(1000);
		
		Select shifttype = new Select(driver.findElement(By.xpath(shifttypeatparampath)));
		shifttype.selectByVisibleText("Break Shift");
		Thread.sleep(3000);
		
		Select noofbreaks = new Select(driver.findElement(By.xpath(noofbreakspath)));
		noofbreaks.selectByVisibleText("4");
		Thread.sleep(2000);
		
		//Break 1
		Select breaktype1 = new Select(driver.findElement(By.xpath(break1typepath)));
		breaktype1.selectByVisibleText("Tea Break");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(break1starttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break1starttimepath))).click().pause(1000).sendKeys(breakstarttime1).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		driver.findElement(By.xpath(break1endtimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break1endtimepath))).click().pause(1000).sendKeys(breakendtime1).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		//Break 2
		Select breaktype2 = new Select(driver.findElement(By.xpath(break2typepath)));
		breaktype2.selectByVisibleText("lunch Break");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(break2starttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break2starttimepath))).click().pause(1000).sendKeys(breakstarttime2).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		driver.findElement(By.xpath(break2endtimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break2endtimepath))).click().pause(1000).sendKeys(breakendtime2).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		//Break 3
		Select breaktype3 = new Select(driver.findElement(By.xpath(break3typepath)));
		breaktype3.selectByVisibleText("smoke break");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(break3starttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break3starttimepath))).click().pause(1000).sendKeys(breakstarttime3).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		driver.findElement(By.xpath(break3endtimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break3endtimepath))).click().pause(1000).sendKeys(breakendtime3).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		//Break 4
		Select breaktype4 = new Select(driver.findElement(By.xpath(break4typepath)));
		breaktype4.selectByVisibleText("lunch Break");
		Thread.sleep(1000);
				
		driver.findElement(By.xpath(break4starttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break4starttimepath))).click().pause(1000).sendKeys(breakstarttime4).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
				
		driver.findElement(By.xpath(break4endtimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(break4endtimepath))).click().pause(1000).sendKeys(breakendtime4).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
				
				
		//Start Time
		driver.findElement(By.xpath(starttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(starttimepath))).click().pause(1000).sendKeys(starttime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
		//End Time
		driver.findElement(By.xpath(endtimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(endtimepath))).click().pause(1000).sendKeys(endtime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
		
				
		Select samedayof1path = new Select(driver.findElement(By.xpath(of1path)));
		samedayof1path.selectByValue("SameDay");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(maxcutoffintimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(maxcutoffintimepath))).click().pause(1000).sendKeys(maxcutintime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
	
		driver.findElement(By.xpath(maxcutoffouttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(maxcutoffouttimepath))).click().pause(1000).sendKeys(maxcutouttime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
	
		Select samedayof2path = new Select(driver.findElement(By.xpath(of2path)));
		samedayof2path.selectByValue("SameDay");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(graceintimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(graceintimepath))).click().pause(1000).sendKeys(graceinitime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
	
		driver.findElement(By.xpath(graceouttimepath)).clear();
		act.moveToElement(driver.findElement(By.xpath(graceouttimepath))).click().pause(1000).sendKeys(graceouttime).pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath(startimelabelroughpath))).click().pause(1000).build().perform();
	
		Select allowovertime = new Select(driver.findElement(By.xpath(allowovertimepath)));
		allowovertime.selectByValue("Yes");
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath(submitbuttonpath))).click().pause(2000).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath(yesbuttonatparampath))).click().pause(2000).build().perform();
	}
	
	@DataProvider	
	public Object[][] performshiftparamreg() throws BiffException, IOException
	{
		Object[][] exdata = getExcelData();
		return exdata;
	}
		
	public Object[][] getExcelData() throws BiffException, IOException
	{
		FileInputStream fi = new FileInputStream("D:\\Projects\\HCM\\workspace_hcm\\HCM\\src\\main\\java\\com\\hcm\\files\\hcm_shift_param_data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet sht = wb.getSheet("inputdata6");
		String[][] exceldata = new String[sht.getRows()][sht.getColumns()];
		for (int i = 0; i < sht.getRows(); i++) {
			for (int j = 0; j < sht.getColumns(); j++) {
				exceldata[i][j] = sht.getCell(j, i).getContents();
			}
		}
		
		return exceldata;
		
	}
	
}
