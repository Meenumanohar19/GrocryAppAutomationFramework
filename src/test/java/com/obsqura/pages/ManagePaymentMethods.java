package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;

public class ManagePaymentMethods extends PageUtility {

	WebDriver driver;

	public ManagePaymentMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr[2]//td[4]/a[1]")
	private WebElement editBtn;

	@FindBy(css = "#limit")
	private WebElement payLimit;

	@FindBy(css = "button[name='Update']")
	private WebElement updateBtn;
	
	@FindBy(xpath = "//tr[2]//td[2]")
	private WebElement payLimitVal;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement payUptAlertText ;

	public void UpdateCreditDetail(int randomNumber) {
		ClickElement(editBtn);
		SetTextBox(payLimit, Integer.toString(randomNumber));
		ClickElement(updateBtn);
//		System.out.println(payLimitVal.getText());
//		System.out.println(String.valueOf(randomNumber));
		
	}
		/*Validation*/
		public void ValidateCreditisUpdated(int randomNumber) {
			Assert.assertEquals(payLimitVal.getText(),String.valueOf(randomNumber));
			System.out.println("Validation is done");
		}
		
	}


