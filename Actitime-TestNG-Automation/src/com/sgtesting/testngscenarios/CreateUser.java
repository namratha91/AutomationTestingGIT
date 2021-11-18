package com.sgtesting.testngscenarios;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateUser {

	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("testngscenarios");

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Actitime-TestNG-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("The Chrome Browser has launched Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the launchBrowser Method , Exception :"+e);
		}
	}

	@Test(priority=2)
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
			log.info("The URL of the Application has navigated Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the navigate Method , Exception :"+e);
		}
	}

	@Test(priority=9)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("The Application has closed Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the closeApplication Method , Exception :"+e);
		}
	}

	@Test(priority=3)
	public void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			log.info("The Application has logged in Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the login Method , Exception :"+e);
		}
	}

	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			log.info("The Fly out window has minimized Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the minimizeFlyOutWindow Method , Exception :"+e);
		}
	}

	@Test(priority=8)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("The Application has logged out Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the logout Method , Exception :"+e);
		}
	}

	@Test(priority=5)
	public void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			log.info("The Application has created the User Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the createUser Method , Exception :"+e);
		}
	}

	@Test(priority=6)
	public void modifyUser()
	{
		try

		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Modified");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			log.info("The Application has modified the User Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the modifyUser Method , Exception :"+e);
		}
	}

	@Test(priority=7)
	public void deleteUser()
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
			log.info("The Application has deleted the User Succesfully!!!!");

		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the deleteUser Method , Exception :"+e);
		}
	}

}



