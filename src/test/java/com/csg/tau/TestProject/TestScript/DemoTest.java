package com.csg.tau.TestProject.TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.merge(caps);
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.get("https://cacert.com");

		Thread.sleep(5000);
		driver.quit();
		//driver.close();
	}

}
