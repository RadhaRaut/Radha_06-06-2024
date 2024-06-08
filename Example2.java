package com.ExceptionHandling;

import java.util.Scanner;

//Scenario-2: try-catch-finally
public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter any text");
			String text = sc.nextLine();
			System.out.println(text.charAt(1));
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		finally {
			System.out.println("Compulsory statements are part of: finnaly block");
			sc.close();
		}
	}

}
