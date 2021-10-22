package com.sgtesting.objectmapdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyCustomerTest{
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

static void createCustomer()
{
	try
	{
		oBrowser.findElement(objmap.getLocator("tasksimage")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("addnewbutton")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("newcustomerlink")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("entercustomernametextfield")).sendKeys("Customer1");
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("createcustomerbutton")).click();
		Thread.sleep(2000);	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}


static void modifyCustomer()
{
	try
	{
		oBrowser.findElement(objmap.getLocator("existingcustomer")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("description")).sendKeys("Modified customer by adding description");
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("savechanges")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void deleteCustomer()
{
	try
	{
		oBrowser.findElement(objmap.getLocator("editcustomer")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("actionsbtn")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("deletebtn")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objmap.getLocator("confirmbtn")).click();
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

public class ModifyCustomer {

	public static void main(String[] args) {
		ModifyCustomerTest.launchBrowser();
		ModifyCustomerTest.navigate();
		ModifyCustomerTest.login();
		ModifyCustomerTest.minimizeFlyOutWindow();
		ModifyCustomerTest.createCustomer();
		ModifyCustomerTest.modifyCustomer();
		ModifyCustomerTest.deleteCustomer();
		ModifyCustomerTest.logout();
		ModifyCustomerTest.closeApplication();

	}

}
