package com.csg.tau.TestProject.TestScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frameshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Paras");
		driver.close();
		}
		catch(NoSuchElementException ex) {
			ex.printStackTrace();
			driver.switchTo().frame(0);
			WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
			textbox.sendKeys("Paras");
			driver.switchTo().defaultContent();
			driver.close();
		}catch(ElementNotVisibleException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		finally {
			System.out.println("Into Finally block");
		}

	}
	
}
