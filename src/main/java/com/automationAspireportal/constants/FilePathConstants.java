package com.automationAspireportal.constants;

import java.io.File;

public class FilePathConstants
{
	
	
	public static  final  String USER_HOME = System.getProperty("user.dir") + File.separator ;
	
	public static final String CHROME_FILE =USER_HOME +  "lib" + File.separator + "chromedriver.exe";
	
	public static final String CONFIG_FILE=USER_HOME + File.separator + "src/main/resources" +File.separator +"configue.properties";
	
	public final static String ASPIREPORTAL_locators = USER_HOME + File.separator + "src/main/resources" + File.separator + "locators" + File.separator  + "atmecs" + File.separator +"aspireportal.properties";
    
	public final static String EMPLOYEE_credentials=USER_HOME + File.separator + "src/main/resources" +File.separator + "testdata" +File.separator
			+ "EmployeeLogincredentials.xlsx";
	
	//public final static String TIMESHEET = USER_HOME + File.separator + "src/main/resources" + File.separator + "locators" + File.separator  + "timesheet.properties";
	
	//public final static String MANAGER = USER_HOME + File.separator + "src/main/resources" + File.separator + "locators" + File.separator  + "managerLogin.properties";
}

