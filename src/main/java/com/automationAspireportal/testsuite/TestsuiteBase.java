package com.automationAspireportal.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testscript.TC01_EmployeePage;
import com.automationAspireportal.utils.ReadLocators;

public class TestsuiteBase

{
	public WebDriver driver;
 ReadLocators read=new ReadLocators();
  @BeforeClass
  public void launchAspire() 
  {
	 System.setProperty("webdriver.chrome.driver",FilePathConstants.CHROME_FILE);
	 driver= new ChromeDriver();
	 String path=read.Url();
	  driver.get(path);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
 
  @AfterClass
  public void teardown() 
  {
	  
	  driver.close(); 
	  
  }
  @Test
  public void login() 
  {
	 TC01_EmployeePage tc=new TC01_EmployeePage();
	  tc.login(driver);
	//  ManagerLogin login=new ManagerLogin(driver);
	  //login.managerlogin();
	 // AdminLogin login=new AdminLogin(driver);
	  //login.adminlogin();
  }

   }
  

