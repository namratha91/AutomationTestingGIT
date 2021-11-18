package com.sgtesting.testngscenarios;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer {

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
	public void createCustomer()
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
			log.info("The Application has created the customer Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the create customer Method , Exception :"+e);
		}
	}
     
    @Test(priority=6)
    public void modifyCustomer()
 	{
 		try
 		{
 			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
 			Thread.sleep(2000);
 			
 			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea\r\n")).sendKeys("Modified customer by adding description");
 			Thread.sleep(2000);
 						
 			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
 			Thread.sleep(2000);	
 			log.info("The Application has modified the customer Succesfully!!!!");
 		}catch(Exception e)
 		{
 			log.error("There is an exception araised during the execution of the modify customer Method , Exception :"+e);
 			
 		}
 	}
    @Test(priority=7)
	public void deleteCustomer()
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
			log.info("The Application has deleted the customer Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the delete customer Method , Exception :"+e);
		}

	}

}
