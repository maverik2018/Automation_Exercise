package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

	public Login(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="input[data-qa='signup-name']")
	WebElement txt_name_css;
	
	@FindBy(css="input[data-qa='signup-email']")
	WebElement txt_pwd_css;
	
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	WebElement btn_submit_xpath;
	
	
	public void setName(String name) {
		txt_name_css.sendKeys(name);
	}
	
	public void setEmail(String email) {
		txt_pwd_css.sendKeys(email);
	}
	
	public void clickSubmit() {
		btn_submit_xpath.click();
	}
}
