package com.sgtesting.assignments;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static WebDriver oBrowser = null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
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
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();			
		}
	}

	static void modifyUser()
	{
		try
	
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Modified");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();			
		}
	}

	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
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