package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {
	WebDriver driver;
	public Login_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='txtUserName']")
	WebElement username ;

	@FindBy(xpath ="//input[@id='txtPassword']")
	WebElement password;

	@FindBy(xpath ="//a[contains(text(),'LOGIN')]")
	WebElement loginbutton;

	public WebElement username() { return username;}
	
	public WebElement password() {return password;}
	
	public WebElement loginbutton() {return loginbutton;}
}
