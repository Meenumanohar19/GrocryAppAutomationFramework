package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.ExcelInput;
import com.obsqura.utilities.PageUtility;

public class LoginPage extends PageUtility{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//define my locators here
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userNameField;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	public void Login() throws IOException {
		SetTextBox(userNameField, ExcelInput.readStringData(0,1));
		SetTextBox(passwordField, ExcelInput.readStringData(1,1));
		ClickElement(loginBtn);	
	}
}