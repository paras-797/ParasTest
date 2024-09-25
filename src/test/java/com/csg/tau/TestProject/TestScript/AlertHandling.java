package com.csg.tau.TestProject.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	@SuppressWarnings("deprecation")
	@Test
	public void abc() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Util util=new Util();
		
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(options);
		try {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Static.html");
//		WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		fn.sendKeys("Pranav");
//		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		ln.sendKeys("devgan");
//		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("abc@gmail.com");
//		String abc=email.getText();
//	
//		WebElement genderM=driver.findElement(By.xpath("//input[@value='Male']"));
//		WebElement genderF=driver.findElement(By.xpath("//input[@value='FeMale']"));
//		genderM.click();
//		WebElement hob=driver.findElement(By.xpath("//input[@value='Cricket']"));
//		hob.click();
//		
//		WebElement dropdown=driver.findElement(By.id("Skills"));
//		Select dd=new Select(dropdown);
//		
//		dd.selectByValue("Analytics");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.google.com");
//		
//		WebElement alertgen=driver.findElement(By.xpath("//*[@id='OKTab']/button"));
//		alertgen.click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().frame("SingleFrame");
//		
//		WebElement iFrameTextBox=driver.findElement(By.xpath("//input[@type='text']"));
//		
//		iFrameTextBox.sendKeys("Testing");
//		driver.switchTo().defaultContent();
		int arr[5]= {1,2,3,4,5}; a[6]
				
				int x=10;
		int y=0;
		int z=x/y;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		util.waitForElement(driver, "angular");
		WebElement  source=driver.findElement(By.id("angular"));
		util.waitForElement(driver, "droparea");
		WebElement dest=driver.findElement(By.id("droparea"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, dest).build().perform();
		
		}catch(UnhandledAlertException ex) {
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			
		}
		catch(ArithmeticException ex) {
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			driver.quit();
		}
		Thread.sleep(10000);
		driver.quit();
		
		//Waits
		
		2: Checked and unchecked exp
	
		
		

	}

}
