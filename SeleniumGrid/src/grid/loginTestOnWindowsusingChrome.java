package grid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class loginTestOnWindowsusingChrome {
	
    WebDriver driver;
	
	
	@Test
	void setup() throws MalformedURLException
	{
		String nodeURL="http://192.168.1.2:9767/wd/hub";
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
	    cap.setPlatform(Platform.WIN10);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		driver=new RemoteWebDriver(new URL(nodeURL),cap);
		//return driver;
	}
	
	@Test
	void login()
	{
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.name("username")).sendKeys("adangowda1995@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adangowda@1234");
		driver.findElement(By.name("login")).click();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
	
	    if(driver.getTitle().contains("My Account – Automation Practice Site"))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("Test failed");
	    }
	    
	    driver.close();
	}

}
