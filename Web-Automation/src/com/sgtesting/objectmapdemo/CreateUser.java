package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CreateUserTest
{
	public static String filename="E:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("adduserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("firstnametextfield")).sendKeys("demo");
			oBrowser.findElement(objmap.getLocator("lastnametextfield")).sendKeys("User1");
			oBrowser.findElement(objmap.getLocator("emailtextfield")).sendKeys("demo@gmail.com");
			oBrowser.findElement(objmap.getLocator("usernametextfield")).sendKeys("demoUser1");
			oBrowser.findElement(objmap.getLocator("passwordtextfield")).sendKeys("Welcome1");
			oBrowser.findElement(objmap.getLocator("retypepasswordtextfield")).sendKeys("Welcome1");
			oBrowser.findElement(objmap.getLocator("createuserbutton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("existinguserlink")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objmap.getLocator("deleteexistinguser")).click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class CreateUser {

	public static void main(String[] args) {

		CreateUserTest.launchBrowser();
		CreateUserTest.navigate();
		CreateUserTest.login();
		CreateUserTest.minimizeFlyOutWindow();
		CreateUserTest.createUser();
		CreateUserTest.deleteUser();
		CreateUserTest.logout();
		CreateUserTest.closeApplication();
	}
}
