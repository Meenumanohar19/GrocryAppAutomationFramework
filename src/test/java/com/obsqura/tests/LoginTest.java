package com.obsqura.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
@Listeners({ com.obsqura.listeners.ReportListeners.class })
public class LoginTest extends BaseTest {

	
	@Test
	public void MyLoginTest() throws IOException {
		
		lp.Login();
//		System.out.println(" I AM IN TEST CASE");
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}
	
}