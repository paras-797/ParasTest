package com.csg.tau.TestProject.TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestString {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			String str="I am Learning java";
			String [] s=str.split(" ");
			for(String s1:s) {
				System.out.println(s1);
			}
			driver.close();


	}

	
}
