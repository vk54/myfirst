package PageFactory;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SupplyMgt_PF {
	WebDriver driver;
	public SupplyMgt_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='menusupplymanagement']")
	WebElement supplymgt_button;
	
	public WebElement supplymenu() {return supplymgt_button;}
	
	@FindBy(xpath="//div[contains(text(),'CREATE NEW SUPPLY')]")
	WebElement homecreatebtn;
	
	public WebElement homecreatebtn() {return homecreatebtn; }
	
	@FindBy(id="supplycreateDCO")
	WebElement dcocreatebtn;
	
	public WebElement dcoCreation() {return dcocreatebtn;}
	
	@FindBy(xpath="//div[contains(text(),'CREATE')]")
	WebElement createbtn1;
	
	public WebElement btncreate() {	return createbtn1;}
	
	@FindBy(xpath="//select[@id='ddlCity']//option[contains(text(),'CHENNAI')]")
	WebElement city;
	
	public WebElement city() {return city; }
	
	@FindBy(xpath="//div[@id='divOuPopup']//div[2]/div[contains(text(),'Ok')]")
	WebElement okbtn;
	
	public WebElement okbtn() {return okbtn;}

	@FindBy(id="txtDriverName")
	WebElement drivername;
	
	public WebElement drivername() {return drivername;}
	
	@FindBy(xpath="//input[@id='txtDob']")
	WebElement dobfield;
	
	public WebElement dob() {return dobfield;}
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']//option[contains(text(),'1954')]")
	WebElement year;
	
	public WebElement year() {return year;}
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tr[4]/td[1]")
	WebElement date;
	
	public WebElement date() {return date;}

	@FindBy(xpath="//input[@id='txtContactNo']")
	WebElement primarycontactno;
	
	public WebElement primarycontactno() {return primarycontactno;}
	
	@FindBy(xpath="//input[@id='txtAlternateContactNo']")
	WebElement secondarycontactno;
	
	public WebElement secondarycontactno() {return secondarycontactno;}
	
	@FindBy(xpath="//input[@id='txtBadgeNo']")
	WebElement batchno;
	
	public WebElement batchno() {return batchno;}
	
	@FindBy(xpath="//input[@id='txtLicenseNo']")
	WebElement license;
	
	public WebElement licence() {return license;}
	
	@FindBy(xpath="//input[@id='ddlVehicleParkingLocation']")
	WebElement baselocationdropdown;
	
	public WebElement baselocationdropdown() {return baselocationdropdown;}
	 
	
	//Thread.sleep(5000);
	
	@FindBy(xpath="//li[contains(text(),'WALL TAX ROAD - 600001')]")
	WebElement Basearea;
	
	public WebElement basearea() {return Basearea;}
	
	@FindBy(id="txtLicenceTo")
	WebElement licensevalidity;
	
	public WebElement licencevalidity() {return licensevalidity;}
	
	@FindBy(id="ddlContractType")
	WebElement contracttype;
	
	public WebElement contracttype() {return contracttype;}
	
	@FindBy(id="ddlPhoneStatus")
	WebElement phonestatus;
	
	public WebElement phonestatus() {return phonestatus;}

	@FindBy(id="menusupplyVehicle")
	WebElement vehiclemenu;
	
	public WebElement vehiclemenu() {return vehiclemenu;}
	
	@FindBy(id="txtRegistrationNo")
	WebElement Regno;
	
	public WebElement regno() {return Regno;}
	
	@FindBy(id="ddlManufacturer")
	WebElement truckmanufacturer;
	
	public WebElement truckmanufacturer() {return truckmanufacturer;}
	
	@FindBy(id="txtYearOfManufacture")
	WebElement yearofmanufacture;
	
	public WebElement yearofmanufacture() {return yearofmanufacture;}
	
	@FindBy(id="txtRoadTaxValidity")
	WebElement Roadtax;
	
	public WebElement roadtax() {return Roadtax;}
	
	@FindBy(id="txtInsPolicyTillDt")
	WebElement insurance;
	
	public WebElement insurance() {return insurance;}
	
	@FindBy(id="txtVehicelFcTillDt")
	WebElement fcvalidility;
	
	public WebElement fcvalidility() {return fcvalidility;}
	
	@FindBy(id="ddlVehicleCategory")
	WebElement vehiclecategory;
	
	public WebElement vehiclecategory() {return vehiclecategory;}
	
	@FindBy(id="ddlIsBranded")
	WebElement branded;
	
	public WebElement branded() {return branded;}
	
	@FindBy(id="divSave")
	WebElement savebtn;
	
	public WebElement savebtn() {return savebtn;}
	
	//Bank detail
	
	@FindBy(id="ddlBankName")
	WebElement banknamefield;
	
	public WebElement bankname() {return banknamefield;}
	
	@FindBy(xpath="//li[contains(text(),'ALLAHABAD BANK')]")
	WebElement banknameselection;
	
	public WebElement banknameselection() {return banknameselection;}
	
	
	@FindBy(id="ddlBranchName")
	WebElement branchname;
	
	public WebElement branchname() {return branchname;}
	
	@FindBy(id="txtAccountNumber")
	WebElement accountnumber;
	
	public WebElement accountnumber() {return accountnumber;}
	
	@FindBy(id="txtLegalName")
	WebElement accountholdername;
	
	public WebElement accountholdername() {return accountholdername;}
	
	
	
	
	
	
	
	/*
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//li[contains(text(),'ADYAR')]")).click();
	//driver.findElement(By.id("txtAccountNumber")).click();
	driver.findElement(By.id("txtLegalName")).sendKeys("testqa");
	robot.keyPress(KeyEvent.VK_PAGE_UP);
	robot.keyRelease(KeyEvent.VK_PAGE_UP);*/
	
	
	
	
	
	
}
