package ReUsable;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class total_Availability {
	
	public void total_AvailabilityTC(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'TODAY AVAILABILITY')]")).click();
		Select fromtime= new Select(driver.findElement(By.id("ddlTimeFrom")));
		fromtime.selectByValue("07:00 AM");
		Select totime=new Select(driver.findElement(By.id("ddlTimeTo")));
		totime.selectByValue("10:00 PM");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img#btnOk")).click();
		//driver.findElement(By.id("btnOk")).click();
	}

}
