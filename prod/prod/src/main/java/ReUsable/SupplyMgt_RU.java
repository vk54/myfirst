package ReUsable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageFactory.SupplyMgt_PF;

public class SupplyMgt_RU {
  WebDriver driver;
	public void Personal(WebDriver driver) throws InterruptedException, AWTException {
		this.driver=driver;
		SupplyMgt_PF supply=new SupplyMgt_PF(driver);
		supply.supplymenu().click();
		Thread.sleep(3000);
		supply.homecreatebtn().click();
		//supply.btncreate().click();
		supply.dcoCreation().click();
		supply.btncreate().click();
		//supply.homecreatebtn().click();
		supply.city().click();
		supply.okbtn().click();
		supply.drivername().sendKeys("test");
		supply.dob().click();
		supply.year().click();
		supply.date().click();
		supply.primarycontactno().sendKeys("1001002002");
		supply.secondarycontactno().sendKeys("1010202018");
		supply.batchno().sendKeys("batch001001");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		supply.licence().sendKeys("lic12as54");
		supply.licencevalidity().sendKeys("23/08/2020");
		
		supply.baselocationdropdown().click();
		supply.basearea().click();
		supply.baselocationdropdown().click();
			
		Select con= new Select(supply.contracttype());
		con.selectByValue("ADHOC");	
		
		Select status=new Select (supply.phonestatus());
		status.selectByValue("MG");
		
		
		
	}
	
	public void  Vehicledetail(WebDriver driver) {
		this.driver=driver;
		SupplyMgt_PF supply=new SupplyMgt_PF(driver);
		supply.vehiclemenu().click();
		supply.regno().sendKeys("tn12as1234");
		//supply.truckmanufacturer()
		Select tr=new Select (supply.truckmanufacturer());
		tr.selectByValue("LS1");
		supply.yearofmanufacture().sendKeys("2010");
		supply.roadtax().sendKeys("21/03/2034");
		supply.fcvalidility().sendKeys("30/05/2050");
		supply.insurance().sendKeys("12/12/2020");
		Select ca=new Select(supply.vehiclecategory());
		ca.selectByValue("OPEN");
		Select branded =new Select(supply.branded());
		branded.selectByValue("NO");
		supply.savebtn().click();
		
		
	}
	public void bankdetail(WebDriver driver) {
		this.driver=driver;
		SupplyMgt_PF supply=new SupplyMgt_PF(driver);
		supply.bankname().click();
		supply.banknameselection().click();
		supply.branchname().sendKeys("ADYAR");
		supply.accountnumber().sendKeys("123567543");
		supply.accountholdername().sendKeys("test");
	}
		
}
