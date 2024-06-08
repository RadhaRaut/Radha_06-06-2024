package com.ExceptionHandling;

import java.util.Scanner;

//Scenario-3: try-finally
public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter any text");
			String text = sc.nextLine();
			System.out.println(text.charAt(1));
		}

	

		finally {
			System.out.println("Compulsory statements are part of: finnaly block");
			sc.close();
		}
	}

}
