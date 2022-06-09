package com.csg.tau.TestProject.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandling {

	@SuppressWarnings("deprecation")
	@Test
	public void abc() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Paras");
		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Kumar");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abc@gmail.com");
		
		WebElement genderM=driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement genderF=driver.findElement(By.xpath("//input[@value='FeMale']"));
		genderM.click();
		WebElement hob=driver.findElement(By.xpath("//input[@value='Cricket']"));
		hob.click();
		Select dd=new Select(driver.findElement(By.id("Skills")));
		dd.selectByVisibleText("Android");
		Thread.sleep(5000);
		driver.close();

	}

}
