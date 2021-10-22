package com.sgtesting.objectmapdemo;

public class AdvancedScenario_2 extends AdvancedScenario_1{

	public static void main(String[] args) {
		
		AdvancedScenario_2 obj1=new AdvancedScenario_2();
		obj1.launchBrowser();
		obj1.navigate();
		obj1.loginUser("admin","manager","Admin");
		obj1.minimizeFlyOutWindow();
		
		obj1.createUser("Demo1","LN","Demo1.user@gmail.com","Demo1","Welcome","Welcome","Demo1");
		obj1.logoutUser("Admin");
		obj1.loginUser("Demo1","Welcome","Demo1");
		obj1.handleWelcomeScreen("Demo1");
		
		obj1.createUser("Demo2","LN","Demo2.user@gmail.com","Demo2","Welcome1","Welcome1","Demo2");
		obj1.logoutUser("Demo1");
		obj1.loginUser("Demo2","Welcome1","Demo2");
		obj1.handleWelcomeScreen("Demo2");
		
		obj1.createUser("Demo3","LN","Demo3.user@gmail.com","Demo3","Welcome12","Welcome12","Demo3");
		obj1.logoutUser("Demo2");
		obj1.loginUser("Demo3","Welcome12","Demo3");
		obj1.handleWelcomeScreen("Demo3");
		obj1.logoutUser("Demo3");
		obj1.loginUser("Demo1", "Welcome", "Demo1");
		obj1.modifyUserPwd("Sample1", "Sample1", "Demo2");
		obj1.logoutUser("Demo1");
		obj1.loginUser("Demo2", "Sample1", "Demo2");
		obj1.logoutUser("Demo2");
		obj1.loginUser("admin", "manager", "Admin");
		obj1.modifyUserPwd("Sample", "Sample", "Demo1");
		obj1.logoutUser("Admin");
		obj1.loginUser("Demo1", "Sample", "Demo1");
		obj1.logoutUser("Demo1");
		obj1.loginUser("Demo2", "Sample1", "Demo2");
		obj1.deleteUser("Demo3");
		obj1.logoutUser("Demo2");
		obj1.loginUser("Demo1", "Sample", "Demo1");
		obj1.deleteUser("Demo2");
		obj1.logoutUser("Demo1");
		obj1.loginUser("admin", "manager", "Admin");
		obj1.deleteUser("Demo1");
		obj1.logoutUser("Admin");	
		obj1.closeApplication();

		
		
		
		

	}

}
