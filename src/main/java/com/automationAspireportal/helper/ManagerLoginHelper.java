package com.automationAspireportal.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationAspireportal.utils.ReadLocators;

public class ManagerLoginHelper 
{   
 /*    WebDriver driver;
     ReadEmployeeProperties readEmployeeProperties=null;
     public ManagerLoginHelper() 
     {
    	 driver=new ChromeDriver();
    	 try {
			readEmployeeProperties=new ReadEmployeeProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	 
     }
     public void launchAspireportalBrowser() throws IOException, InterruptedException
     {
   	  
   	  String path=readEmployeeProperties.getUrl();
   	  driver.get(path);
   	  driver.manage().window().maximize();
   	  Thread.sleep(2000);
     }
	public void managerLogin()
	{
		  String emailPath=readEmployeeProperties.mailPath();
		  String email=readEmployeeProperties.enterEmail();
		  String passwordpath=readEmployeeProperties.passwordPath();
		  String password=readEmployeeProperties.enterPassword();
		  String login=readEmployeeProperties.clickOnLogin();
		  WebElement user=driver.findElement(By.xpath(emailPath));
		  user.sendKeys(email);
		  WebElement userPassword=driver.findElement(By.xpath(passwordpath));
		  userPassword.sendKeys(password);
		  WebElement loginbt=driver.findElement(By.xpath(login));
		  loginbt.click();
		
		
	}*/

}
