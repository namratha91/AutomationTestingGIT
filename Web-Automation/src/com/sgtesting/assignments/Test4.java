package com.sgtesting.assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		createCustomer();
		modifyCustomer();
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
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);

		} catch (Exception e) {


			e.printStackTrace();
		}

	}


	static void createCustomer() {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("TestCustomer");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea\r\n")).sendKeys("Modified customer by adding description");
			Thread.sleep(2000);
						
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout() {
     
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