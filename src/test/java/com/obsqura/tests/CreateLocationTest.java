package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ com.obsqura.listeners.ReportListeners.class })
public class CreateLocationTest extends BaseTest{
	@Test
	public void ManageLocationTest() throws IOException
	{
	
	lp.Login();
	hp.NavigateToManageLocation();

}
}
