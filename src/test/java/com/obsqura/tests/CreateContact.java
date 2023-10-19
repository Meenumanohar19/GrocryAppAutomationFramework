package com.obsqura.tests;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.model.Person;
import com.obsqura.utilities.ExcelReaderUtility;

public class CreateContact extends BaseTest {

	@Test
	public void CreateContactTest() throws IOException, InterruptedException {
		
		lp.Login();
		hp.NavigateToManageContact();
		 List<Person> list = ExcelReaderUtility.readDataFromExcel();
		 System.out.println(list);
		 for(Person person :list) {
				cp.submitFormData(person);
				String validationText = cp.submitFormData(person);
				 Assert.assertEquals(validationText,  "Contact Updated Successfully");	 
		 }
		 
		
	}
}
