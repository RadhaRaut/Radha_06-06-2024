package com.ExceptionHandling;

//Scenario 1= try - catch
public class Example1 {

	public static void main(String[] args) {

		try // try is a block which can has problematic part/ statement
		{
			String text = "my country name is bharat";
			System.out.println(text.charAt(80));
		} 
		catch (Exception e) // catch is a block which can has part/ statement
		{
			e.printStackTrace();
		}
	}
}
