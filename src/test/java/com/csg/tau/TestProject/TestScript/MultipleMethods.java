package com.csg.tau.TestProject.TestScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleMethods {
	@BeforeSuite
	public void btest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		System.out.println("btest is running");
		driver.close();

	}
	@Test
	public void ctest() throws InterruptedException {

		System.out.println("ctest is running");

	}
	@BeforeMethod
	public void atest() throws InterruptedException {

		System.out.println("atest is running");

	}		

	@BeforeClass
	public void ztest() throws InterruptedException {

		System.out.println("ztest is running");

	}

	@BeforeTest
	public void ktest() throws InterruptedException {

		System.out.println("ktest is running");

	}

	@AfterClass
	public void ltest() throws InterruptedException {

		System.out.println("ltest is running");

	}

	@AfterSuite
	public void mtest() throws InterruptedException {

		System.out.println("mtest is running");

	}
}
