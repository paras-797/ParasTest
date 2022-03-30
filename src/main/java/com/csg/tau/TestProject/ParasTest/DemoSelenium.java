package com.csg.tau.TestProject.ParasTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//WebElement allOption=driver.findElement(By.id("nav-hamburger-menu"));
		WebElement allOption=driver.findElement(By.xpath("//a[starts-with(@id,'nav-hamburger')]"));
		allOption.click();
		Thread.sleep(1000);
//		WebElement bestseller=driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible>li:nth-child(2)"));
//		bestseller.click();
//		WebElement closeButton=driver.findElement(By.className("hmenu-close-icon"));
//		closeButton.click();
		
		WebElement newRel=driver.findElement(By.xpath("//a[text()='Best Sellers']/parent::li/following-sibling::li/a"));
		newRel.click();
		Thread.sleep(2000);
		driver.quit();

		

	}

}
