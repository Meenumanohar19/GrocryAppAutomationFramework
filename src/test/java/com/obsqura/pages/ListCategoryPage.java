package com.obsqura.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ListCategoryPage extends PageUtility {
	
	WebDriver driver;

	public ListCategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newButton;
	
	@FindBy(xpath = "//input[@id='category']")
	private WebElement titlefield;
	
	@FindBy(xpath = "//*[@id=\"134-selectable\"]/span")
	private WebElement grpBtn;
	
	@FindBy(xpath = "//*[@id=\"main_img\"]")
	private WebElement uploadImg;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div[4]/div[1]/label[3]/input")
	private WebElement topUp;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div[4]/div[2]/label[3]/input")
	private WebElement leftUp;
	
	@FindBy(xpath = "//button[@name='create']")
	private WebElement save;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertTextOne;
	
	public String addCategory(String currentDate) throws InterruptedException {
		String name = "MyTestMee";
		ClickElement(newButton);
		SetTextBox(titlefield, name + currentDate);
		ClickElement(grpBtn);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
	    //ClickElement(topUp);
        //ClickElement(leftUp);
		
		ClickElement(save);
		
		String alertMsg = GetElemenText(alertTextOne);
		System.out.println(alertMsg.split("Alert!")[1].trim());
		return alertMsg.split("Alert!")[1].trim();
	}

}
