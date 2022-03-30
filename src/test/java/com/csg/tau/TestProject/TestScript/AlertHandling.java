package com.csg.tau.TestProject.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alertwithcancel=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alertwithcancel.click();
		WebElement button=driver.findElement(By.className("btn-primary"));
		button.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();

	}

}
