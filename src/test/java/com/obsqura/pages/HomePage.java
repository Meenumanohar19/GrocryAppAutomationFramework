package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class HomePage extends PageUtility{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Manage Expense')]")
	private WebElement manageExpenseBtn;
	

	@FindBy(xpath="//p[normalize-space()='Expense Category']")
	private WebElement expenseCategory;
	
	@FindBy(xpath="//p[normalize-space()='Manage Payment Methods']")
	private WebElement managePaymentMethods;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Product')]")
	private WebElement manageProduct;
	
	@FindBy(xpath="//p[normalize-space()='Manage Category']")
	private WebElement manageCategory;
	
	@FindBy(xpath="//p[normalize-space()='Category']")
	private WebElement category;
	
	@FindBy(xpath="//p[normalize-space()='Manage Delivery Boy']")
	private WebElement manageDeliveryBoy;
	
	@FindBy(xpath="//p[normalize-space()='Manage Location']")
	private WebElement manageLocation;
	
	@FindBy(xpath="//*[contains(text(),'Manage Content')]")
	private WebElement manageContent ;
	
	@FindBy(xpath="//*[contains(text(),'Manage Contact')]")
	private WebElement manageContact;
	
	
	public void NavigateToManageExpense() {
		ClickElement(manageExpenseBtn);
		ClickElement(expenseCategory);

	}
	public void NavigateToManagePaymentSection() {
		ClickElement(managePaymentMethods);
	}
	public void NavigateToManageProductSection() {
		ClickElement(manageProduct);
	}
	
	public void NavigateToManageCategorySection() {
		ClickElement(manageCategory);
		ClickElement(category);
	}
	public void NavigateToManageDeliveryBoy() {
		ClickElement(manageDeliveryBoy);
	}
	
	public void NavigateToManageLocation() {
		ClickElement(manageLocation);
	}
	
	public void NavigateToManageContact() {
		ClickElement(manageContent);
		ClickElement(manageContact);
	}
	
}