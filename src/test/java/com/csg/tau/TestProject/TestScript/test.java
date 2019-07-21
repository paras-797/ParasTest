package com.csg.tau.TestProject.TestScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.csg.tau.TestProject.ParasTest.GoogleHomePage;


@Listeners(ListenerTest.class)
public class test{

	@Test
	public void f1() throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Paras sharma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://www.google.com";
        driver.get(baseUrl);
        driver.close();
        //Thread.sleep(10000);
        GoogleHomePage testpage=new GoogleHomePage(driver);
        //Assert.assertEquals(testpage.entertext("Selenium"), true, "entering text");
        //testpage.selectListItem();
        //testpage.clickSearch();
        
        }

	}


