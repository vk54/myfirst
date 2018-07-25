package Testcases;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.browser;
import OR.objectRepository;
import PageFactory.SupplyMgt_PF;
import ReUsable.Login;
import ReUsable.SupplyMgt_RU;
import ReUsable.hambutton;
 
public class supplymanagement extends browser  {
	//WebDriver driver;
	@Test
	public  void supply_tc() throws IOException, InterruptedException, AWTException   {
		// TODO Auto-generated method stub
		//driver=browse();
	
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\myfirst-master\\prod\\prod\\globalvalues.properities");
		prop.load(fis);
		Login log=new Login(driver, prop.getProperty("username"), (prop.getProperty("password")));
		

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
