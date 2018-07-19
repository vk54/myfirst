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
	public void login() throws InterruptedException, IOException {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk982_000\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://lynkuat.lynk.co.in/gandalfqa/");
		driver.manage().window().maximize();
		Login_PF loginpage=new Login_PF(driver);
		loginpage.username().sendKeys("testall@lynk.co.in");
		loginpage.password().sendKeys("password12*");
		loginpage.loginbutton().click();*/
		//this. driver=driver;
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vk982_000\\Downloads\\prod\\prod\\globalvalues.properities");
		prop.load(fis);
		
	/*	browser B= new browser();
		B.browse();
		System.out.println("sample");*/
		driver.findElement(By.id("txtUserName")).sendKeys("testall");
		
		/*Login_PF log= new Login_PF(driver);
		log.username().sendKeys(prop.getProperty("username"));
		log.password().sendKeys(prop.getProperty("password"));
		log.loginbutton().click();*/
		
		Login log=new Login(driver, prop.getProperty("username"), (prop.getProperty("password")));
		
		
	
		
		
		
		
		
		
	
		
	}

}
