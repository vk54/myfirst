package ReUsable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hambutton {
	WebDriver driver;
	public  hambutton (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//div[@class='hamburger hamburgericon']")
	WebElement hambutton;
	
	public WebElement button() {return hambutton;}
	
}
