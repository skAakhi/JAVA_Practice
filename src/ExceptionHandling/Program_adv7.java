package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program_adv7 {
	
	/*
	 * 1. Providing my own exception message to java if it found itself any error or exception.
	 * 
	 * 2. Providing my own exception message to my application if it occurs any event like exceptions ex: login credentials e.t.c..  
	 * 
	 */

	public static void main(String[] args) throws Exception {
		
		try {
			System.out.println(9/0);
		}
		catch(ArithmeticException e3) {
			//Login is like a constructor here , so in Login class we have to create one  parameterized constructor to pass the exception message to my application if found any un_occur event
			throw new Login("Login failed Stupid try again");
		}
		}

	}


