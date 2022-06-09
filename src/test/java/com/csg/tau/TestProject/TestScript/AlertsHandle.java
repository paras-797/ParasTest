package com.csg.tau.TestProject.TestScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsHandle {
	@Test
	public void xyz() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement awt=driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
		awt.click();
		WebElement clickButton=driver.findElement(By.cssSelector(".btn.btn-info"));
		clickButton.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("test text");
		al.accept();
		
		driver.close();
	}

}
