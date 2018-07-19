package ReUsable;

import org.openqa.selenium.WebDriver;

import PageFactory.Login_PF;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver, String username,String password) {
	this. driver=driver;
	Login_PF loginpage=new Login_PF(driver);
	loginpage.username().sendKeys(username);
	loginpage.password().sendKeys(password);
	loginpage.loginbutton().click();

}
}