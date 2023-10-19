package com.obsqura.tests;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
@Listeners({ com.obsqura.listeners.ReportListeners.class })
public class AddDeliveryBoyTest extends BaseTest{
	
	@Test
	public void CreateDeliveryBoyTest() throws IOException, InterruptedException
	{
		lp.Login();
		hp.NavigateToManageDeliveryBoy();
		String currentDate= DateUtility.getCurrentDate();
		String alert = ldp.CreateDeliveryBoy(currentDate);
		Assert.assertEquals(alert, "Delivery Boy Details Created Successfully");
		System.out.println("Passed");
	}

}
