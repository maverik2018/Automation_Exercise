package TestCases;


import org.testng.annotations.Test;

import PageObjects.Login;

public class TC01_UserRegsitration extends BaseClass {
	
	@Test
	public void test_login() {
		logger.info("****** TC001 *********");
		Login lp = new Login(driver);
		lp.setName("MDASDSAD");
		lp.setEmail("MASDA@gmail.com");
		lp.clickSubmit();
		
	
		driver.quit();
		
		
		
		
	}

}
