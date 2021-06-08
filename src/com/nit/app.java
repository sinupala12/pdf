package com.nit;

import java.util.Scanner;

import com.nit.PdfGenerateTest;

public interface app  {

	
	public static String DisplayName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Employee Id ");
		Integer id=sc.nextInt();
		System.out.println("enter a First Name");
		String FirstName=sc.next();
		System.out.println("enter a Last Name");
		String Lastname=sc.next();
		return "firstName"+"LastName"+"+id";
	}

}
