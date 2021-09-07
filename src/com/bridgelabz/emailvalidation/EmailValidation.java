package com.bridgelabz.emailvalidation;
import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {

	public static boolean emailValidation(String emailAddress) {
		String emailRegex = "^[a-zA-Z]{1,}[\\.\\_\\-\\+]?[a-zA-Z]*[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{2,}";
		return Pattern.matches(emailRegex,emailAddress);
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter email");
		String email=scanner.nextLine();
		while(!emailValidation(email)) {
			System.out.println("Invalid format. Enter again");
			email=scanner.nextLine();
		}
		
	}

}
