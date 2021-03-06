package com.automationAspireportal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;

public class ManagerLogin extends TestsuiteBase
{
	ReadLocators read=new ReadLocators ();
	ReadExcel excel;
	public ManagerLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	//public ManagerLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	//}
	public void managerlogin() 
	{
		 excel=new ReadExcel(1);
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
		
	}
	
}
