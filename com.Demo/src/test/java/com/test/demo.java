package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void test01() {
		
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/admin/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			 driver.findElement(By.id("password")).sendKeys("123456");
			 driver.findElement(By.xpath("//button")).click();
	}
}
