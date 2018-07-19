package Testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OR.objectRepository;
import PageFactory.SupplyMgt_PF;
import ReUsable.Login;
import ReUsable.SupplyMgt_RU;
import ReUsable.hambutton;

public class supplymanagement  {

	public static void main(String[] args) throws InterruptedException, AWTException   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://lynkuat.lynk.co.in/gandalfqa/Login.aspx");
	//	login log=new login(driver);
	//	login lg= new login();
	
	    Login log=new Login(driver,"testall@lynk.co.in","password12*");
	    hambutton ham= new hambutton(driver);
		Thread.sleep(5000);
		ham.button().click();
		//SupplyMgt_PF supply= new SupplyMgt_PF(driver);
		SupplyMgt_RU supply1=new SupplyMgt_RU();
		supply1.Personal(driver);
		supply1.bankdetail(driver);
		supply1.Vehicledetail(driver);
		/*supply.supplymenu().click();
		Thread.sleep(3000);
		supply.createbtn().click();
		Thread.sleep(3000);
		supply.dcoCreation().click();
		SupplyMgt_RU ru=new SupplyMgt_RU();
		//ru.supplycreatebtn(driver).click();*/
		
		
		
		//ru.supplycreatebtn(driver).click();
	}

}
