package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
        importTasks();
        deleteTasks();
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
	
	static void importTasks()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteTasks()
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
