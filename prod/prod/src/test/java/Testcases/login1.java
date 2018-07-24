package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.browser;
import PageFactory.Login_PF;
import PageFactory.SupplyMgt_PF;
import ReUsable.Login;
import ReUsable.SupplyMgt_RU;
import ReUsable.hambutton;

public class login1 extends browser {
	WebDriver driver;
	@Test
	public void login(WebDriver driver) throws InterruptedException, IOException {

		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vk982_000\\Downloads\\prod\\prod\\globalvalues.properities");
		prop.load(fis);
		
		driver=browse();
		
		Login log=new Login(driver, prop.getProperty("username"), (prop.getProperty("password")));
		
		
	
		
		
		
		
		
		
	
		
	}

}
