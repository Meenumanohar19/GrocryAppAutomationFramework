package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.ExcelInput;
import com.obsqura.utilities.PageUtility;

public class ListDeliveryBoyPage extends PageUtility {
	
	WebDriver driver;

	public ListDeliveryBoyPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newBoy;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement boyName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phnNum;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	private WebElement address ;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement userName ;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit ;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMsg;
	
	public String CreateDeliveryBoy(String currentDate) throws IOException, InterruptedException
	{
		String name = "Test";
		ClickElement(newBoy);
		SetTextBox(boyName, currentDate + name);
		SetTextBox(email,ExcelInput.readStringData(0,2));
		SetTextBox(phnNum,"9876543210");
		SetTextBox(address,ExcelInput.readStringData(1,2));
		SetTextBox(userName,currentDate + name);
		SetTextBox(pwd,ExcelInput.readStringData(2,2));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		ClickElement(submit);
		String alertMsgDisp = GetElemenText(alertMsg);
		return alertMsgDisp.split("Alert!")[1].trim();
	}

	
	

}

