package com.sgtesting.testngscenarios;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateTask {
	
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

	@Test(priority=12)
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

	@Test(priority=11)
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
	public void createProject()
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
			log.info("The Application has created the project Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the create project Method , Exception :"+e);

		}
	}

	@Test(priority=7)
	public void createTask()
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
			log.info("The Application has created the task Succesfully!!!!");
			
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the create task Method , Exception :"+e);

		}
	}

	@Test(priority=8)
	public void deleteTask()
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
			log.info("The Application has deleted the task Succesfully!!!!");
		}catch(Exception e)
		{	
			log.error("There is an exception araised during the execution of the delete task Method , Exception :"+e);

		}
	}

	@Test(priority=9)
	public void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(4000);
			//oBrowser.findElement(By.linkText("Add New")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
			log.info("The Application has deleted the project Succesfully!!!!");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the delete project Method , Exception :"+e);

		}
	}
	@Test(priority=10)
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



