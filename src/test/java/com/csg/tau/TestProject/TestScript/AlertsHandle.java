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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Downloads\\chrome-win32\\chrome.exe");
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
		
		WebElement searchBox=driver.findElement(By.name("field-keywords"));
		searchBox.sendKeys("hairdryer");
		
		WebElement serachButton=driver.findElement(By.name("field-keywords"));
		serachButton.click();
		xpath
		absolute relative xpath
		
		driver.close();
		
		abc123
		abc234
		abc456
		driver.quit();
		
		/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input
		//*
		WebElement button=driver.findElement(By.xpath("//select[@class='form-control']/input"));
		
		driver.findElement(By.cssSelector("select.form-control>input"));
		id="abc"
				@id="abc"
				#abc
		button.click();
		
		
		
	}

}
