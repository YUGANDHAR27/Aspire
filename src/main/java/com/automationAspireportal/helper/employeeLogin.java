package com.automationAspireportal.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPath;

import org.apache.commons.collections4.SetValuedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;

public class employeeLogin extends TestsuiteBase
{

	ReadLocators read=new ReadLocators ();
	ReadExcel excel;
	public employeeLogin(WebDriver driver) 
	{
	this.driver=driver;

	}
	 /*public void login()
	  {
		 //driver.get("http://14.98.116.9/aspire_qa/login");
	  //  PageFactory.initElements(driver, this);
		 
		 	  }*/
	 public void employeelogin()
	 {
		 excel=new ReadExcel(0);
		 String username=read.emailPath();
		 String password=read.passwordPath();
		 String email=excel.getmail();
		 String employeepassword=excel.password();
		 String clicklogin=read.clickOnLogin();
		 String ts=read.clickonTimesheet();
		 WebElement user=driver.findElement(By.xpath(username));
		 user.sendKeys(email);
		 WebElement epassword=driver.findElement(By.xpath(password));
		 epassword.sendKeys(employeepassword);
		 WebElement click=driver.findElement(By.xpath(clicklogin));
		 click.click();
		 WebElement clickonts=driver.findElement(By.xpath(ts));
		 clickonts.click();
		driver.findElement(By.className("form-control select2 selectactivity select2-hidden-accessible")).sendKeys("Daily scrum");
			Robot rb=null;
			try {
		        rb=new Robot();
			} catch (AWTException e)
			{
				e.printStackTrace();
			}
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		//WebElement activ=driver.findElement(By.xpath("//span[contains(text(),'Daily scrum')]"));
		 //activ.click();
		//WebElement email= driver.findElement(By.xpath(read.emailPath()));
				//email.sendKeys(excel.getmail());
	//	WebElement password= driver.findElement(By.xpath(read.passwordPath()));
		//		password.sendKeys(excel.password());
		 //driver.findElement(By.xpath(read.clickOnLogin())).click();
		// Select select=new Select(driver.findElement(By.className("select2-selection__rendered")));
		 //select.selectByVisibleText("Code Review");
		 
	 }
	 }


