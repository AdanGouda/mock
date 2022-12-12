package Certificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class AcceptSSL {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://cacert.org");
	}

}
