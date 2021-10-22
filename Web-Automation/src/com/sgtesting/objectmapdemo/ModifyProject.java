package com.sgtesting.objectmapdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyProjectTest
{

	public static String filename="E:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;

	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();
	}

	static void navigate() {

		try 
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);

		} catch (Exception e)
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

	static void createProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("addnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("newproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("enterprojectname")).sendKeys("TestProject");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createproject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifyProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("existingproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("description")).sendKeys("Modified description in the project");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("existingproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("actions")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("delete")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletepermanently")).click();
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

public class ModifyProject {

	public static void main(String[] args) {
		ModifyProjectTest.launchBrowser();
		ModifyProjectTest.navigate();
		ModifyProjectTest.login();
		ModifyProjectTest.createCustomer();
		ModifyProjectTest.createProject();
		ModifyProjectTest.modifyProject();
		ModifyProjectTest.deleteProject();
		ModifyProjectTest.deleteCustomer();
		ModifyProjectTest.logout();
		ModifyProjectTest.closeApplication();

	}

}


