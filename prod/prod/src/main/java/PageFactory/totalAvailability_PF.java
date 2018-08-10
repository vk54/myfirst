package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class totalAvailability_PF {
	
	public totalAvailability_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(id ="ddlTimeFrom")
	WebElement fromtime ;
	
	@FindBy(id ="ddlTimeTo")
	WebElement totime ;
	
	@FindBy(xpath ="//*[@id='tblInput']/tbody/tr[3]/td/img[1]")
	WebElement okbutton ;
	
	
}