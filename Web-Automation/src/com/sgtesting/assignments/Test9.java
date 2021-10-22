package com.sgtesting.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static WebDriver oBrowser = null;

	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("Chrome browser launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			System.out.println("Actitime URL launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println(user+" logged in successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void handleWelcomeScreen(String user)
	{
		try {
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//span[contains(text(),'Start exploring actiTIME')]")).click();
			System.out.println(user+" handled Welcome screen");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("Minimized FlyOutWindow successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

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
			System.out.println(user+ " created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

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
			System.out.println(user+ " deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

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
			System.out.println(user+ " Password updated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(2000);
			System.out.println("Actitime Chrome Browser closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	

	public void logoutUser(String user)
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println(user+ " Logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {

		Test9 obj = new Test9();
		obj.launchBrowser();
		obj.navigate();
		obj.loginUser("admin","manager","Admin");
		obj.minimizeFlyOutWindow();
		obj.createUser("Demo1","LN","Demo1.user@gmail.com","Demo1","Welcome","Welcome","Demo1");
		obj.createUser("Demo2","LN","Demo2.user@gmail.com","Demo2","Welcome1","Welcome1","Demo2");
		obj.createUser("Demo3","LN","Demo3.user@gmail.com","Demo3","Welcome12","Welcome12","Demo3");
		obj.logoutUser("Admin");
		obj.loginUser("Demo1","Welcome","Demo1");
		obj.handleWelcomeScreen("Demo1");
		obj.logoutUser("Demo1");
		obj.loginUser("Demo2","Welcome1","Demo2");
		obj.handleWelcomeScreen("Demo2");
		obj.logoutUser("Demo2");
		obj.loginUser("Demo3","Welcome12","Demo3");
		obj.handleWelcomeScreen("Demo3");
		obj.logoutUser("Demo3");
		obj.loginUser("admin","manager","Admin");
		obj.modifyUserPwd("Sample","Sample","Demo1");
		obj.modifyUserPwd("Sample1","Sample1","Demo2");
		obj.modifyUserPwd("Sample12","Sample12","Demo3");
		obj.logoutUser("Admin");
		obj.loginUser("Demo1","Sample","Demo1");
		obj.logoutUser("Demo1");
		obj.loginUser("Demo2","Sample1","Demo2");
		obj.logoutUser("Demo2");
		obj.loginUser("Demo3","Sample12","Demo3");
		obj.logoutUser("Demo3");
		obj.loginUser("admin","manager","Admin");
		obj.deleteUser("Demo1");
		obj.deleteUser("Demo2");
		obj.deleteUser("Demo3");
		obj.logoutUser("Admin");
		obj.closeApplication();		

	}

}


