package com.obsqura.tests;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
@Listeners({ com.obsqura.listeners.ReportListeners.class })

public class CreateListCategoryTest extends BaseTest { 
	
	@Test
	public void SearchProduct() throws IOException, InterruptedException {
		lp.Login();
		hp.NavigateToManageCategorySection();
		
		String currentDate= DateUtility.getCurrentDate();
		String alertTextTwo = lcp.addCategory(currentDate);
		
		/**
		 * Validation for category Creation
		 */
		Assert.assertEquals(alertTextTwo, "Category Created Successfully");
		

}
	
	

	
	
	
	

}