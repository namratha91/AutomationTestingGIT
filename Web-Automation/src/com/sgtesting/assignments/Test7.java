package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test7 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
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

	static void login() {

		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	static void createCustomer() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("SampleCustomer");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("SampleProj");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createTask()
	{
		try

		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			oBrowser.findElement(By.id("createTasksPopup_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteTask()
	{
		try 
		{	
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			
			//oBrowser.findElement(By.linkText("Add New")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
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


