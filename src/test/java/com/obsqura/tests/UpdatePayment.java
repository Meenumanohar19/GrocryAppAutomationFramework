package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.utilities.GenerateRandomNumber;
@Listeners({ com.obsqura.listeners.ReportListeners.class })
public class UpdatePayment extends BaseTest{

	@Test
	public void UpdateCreditPayment() throws IOException {
		lp.Login();
		hp.NavigateToManagePaymentSection();
		int randomNumber=GenerateRandomNumber.GetRandomNumber();
		up.UpdateCreditDetail(randomNumber);
		up.ValidateCreditisUpdated(randomNumber);
		
	
	}
}