package com.obsqura.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.constants.Constants;
import com.obsqura.constants.WebDriverContext;

public class PageUtility {
	WebDriver driver;
	public PageUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickElement(WebElement element) {
		element.click();
	}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void waitFor() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void isElementDisplayed(WebElement element) {
		waitFor();
		try {
			if (element.isDisplayed()) {
				//System.out.println("element is Displayed " + element);
			}
		} catch (Exception e) {
			//Assert.assertTrue(false);
		}

	}
	
	public void SetTextBox(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	
	public String GetElemenText(WebElement element) {
		return element.getText();
	}
	
	public void AcceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public static String getScreenshot() throws IOException {
		TakesScreenshot scrshot=(TakesScreenshot)WebDriverContext.getDriver();
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		String path=Constants.SCREENSHOTPATH;
		File destfile = new File(path);
		FileUtils.copyFile(srcfile, destfile);
		return path;
	}
}