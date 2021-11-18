package com.sgtesting.testngscenarios;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Advanced_Scenario1 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("testngscenarios");

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("Chrome browser launched successfully");
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
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			log.info("Actitime URL launched successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the navigate Method , Exception :"+e);
		}
	}

	public void loginUser(String username, String password, String user)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			//oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();//a[div='Login ']
			oBrowser.findElement(By.xpath("//a[div='Login ']")).click();
			Thread.sleep(5000);
			log.info(user+" logged in successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the login Method , Exception :"+e);
		}
	}

	@Test(priority=3)
	public void handleWelcomeScreen(String user)
	{
		try 
		{
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//span[contains(text(),'Start exploring actiTIME')]")).click();
			Thread.sleep(2000);
			log.info(user+" handled Welcome screen");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the handleWelcomeScreen Method , Exception :"+e);

		}
	}

	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			log.info("Minimized FlyOutWindow successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the minimizeFlyoutWindow Method , Exception :"+e);

		}
	}
	@Test(priority=5)
	public void createUser(String firstname, String lastname, String email, String loginName, String pswd, String repaswd, String user)
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			//oBrowser.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@*='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(firstname);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastname);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(loginName);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pswd);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(repaswd);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			log.info(user+ " created successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the createUser Method , Exception :"+e);

		}
	}

	@Test(priority=6)
	public void deleteUser(String user)
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			//oBrowser.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[contains(text(),'"+user+"')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj = oBrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			log.info(user+ " deleted successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the deleteUser Method , Exception :"+e);
		}
	}


	@Test(priority=7)
	public void modifyUserPwd(String paswd, String repswd, String user)
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			//oBrowser.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[contains(text(),'"+user+"')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(paswd);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(repswd);
			//oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			oBrowser.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
			Thread.sleep(4000);
			log.info(user+ " Password updated successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the modifyUserPwd Method , Exception :"+e);

		}
	}

	@Test(priority=9)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(2000);
			log.info("Actitime Chrome Browser closed successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the closeApplication Method , Exception :"+e);
		}
	}

	@Test(priority=8)
	public void logoutUser(String user)
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info(user+ " Logged out successfully");
		}catch(Exception e)
		{
			log.error("There is an exception araised during the execution of the logoutUser Method , Exception :"+e);
		}
	}

}




