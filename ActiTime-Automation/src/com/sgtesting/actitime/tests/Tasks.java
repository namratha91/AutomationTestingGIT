package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tasks {
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static WebDriver oBrowser=null;
	public static void createTask()
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
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static void modifyTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Modify the task description");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static void deleteTask()
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

}
