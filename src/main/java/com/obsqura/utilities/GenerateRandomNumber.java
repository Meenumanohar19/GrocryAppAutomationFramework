package com.obsqura.utilities;

import org.testng.annotations.Test;

public class GenerateRandomNumber {

	
	public static int GetRandomNumber() {
		
		double doubleRandomNumber = Math.random() * 5000;
        int randomNumber = (int)doubleRandomNumber;
       return randomNumber;
	}
}
