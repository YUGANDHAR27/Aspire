package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.utils.ReadLocators;

public class TC01_EmployeePage
{
	/*ReadLocators read=new ReadLocators ();
	ReadExcel excel=new ReadExcel();
	public TC01_EmployeePage(WebDriver driver)
	{
	
	this.driver=driver;

	}
	 public void login()
	  {
		 //driver.get("http://14.98.116.9/aspire_qa/login");
	  //  PageFactory.initElements(driver, this);
		 String username=read.emailPath();
		 String password=read.passwordPath();
		 String email=excel.getmail();
		 String employeepassword=excel.password();
		 String clicklogin=read.clickOnLogin();
		 WebElement user=driver.findElement(By.xpath(username));
		 user.sendKeys(email);
		 WebElement epassword=driver.findElement(By.xpath(password));
		 epassword.sendKeys(employeepassword);
		 WebElement click=driver.findElement(By.xpath(clicklogin));
		 click.click();

	  }*/
	
	public void login(WebDriver driver)
	{
		ReadLocators read=new ReadLocators();
		employeeLogin loginin=new employeeLogin(driver);
		loginin.employeelogin();
		 driver.findElement(By.xpath(read.clickOnLogin())).click();

		
		
	}
	
	
	
}
