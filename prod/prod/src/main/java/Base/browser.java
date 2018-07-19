package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browser{
	//WebDriver driverObj;
	 public WebDriver driver=null;
	
	@Test
	public void browse() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vk982_000\\Downloads\\prod\\prod\\globalvalues.properities");
		prop.load(fis);
		if(prop.getProperty("browser").contains("chrome"))
		{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk982_000\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else {
			WebDriver driver=new FirefoxDriver();
		}
		 driver.get(prop.getProperty("url"));
		
	}
	
}
