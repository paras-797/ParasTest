package com.csg.tau.TestProject.TestScript;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindlowHandlling {
	@Test
		public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'btn-info') and (text()='    click   ')]"));
		String parent=driver.getWindowHandle();
		button.click();
		Set<String> windows=driver.getWindowHandles();
		for(String child: windows) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				Thread.sleep(2000);
				WebElement ele=driver.findElement(By.xpath("//a[@class='nav-link']/span[text()='Documentation']"));
				ele.click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();

	}

}
