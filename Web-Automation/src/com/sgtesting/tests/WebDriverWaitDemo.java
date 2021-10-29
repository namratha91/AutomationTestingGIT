package com.sgtesting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();

	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		/*	WebDriverWait wait =new WebDriverWait(oBrowser,30);
			wait.until(ExpectedConditions.titleContains("actiTIME12345"));
		*/
		/*	WebDriverWait wait =new WebDriverWait(oBrowser,20);
			wait.until(ExpectedConditions.titleIs("actiTIME - Login123"));
		*/
		/*	WebDriverWait wait =new WebDriverWait(oBrowser,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login ']")));
		*/
			WebDriverWait wait =new WebDriverWait(oBrowser,20);
			wait.until(ExpectedConditions.attributeContains(By.id("username"), "id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
