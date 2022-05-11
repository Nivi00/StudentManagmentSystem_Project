package com.edu;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//Menu from user
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("********WELCOME TO ST.MARY'S GIRL'S HIGHER SECONDARY SCHOOL************");
		System.out.println("Enter your choice");
		System.out.println("1.To display Student information");
		System.out.println("2.Insert Student record");
		System.out.println("3.Update Student information based on id");
		System.out.println("4.Delete Student information based on id");
		System.out.println("5.Select Student based on ID");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: StudentInfo.displayStudentInfo();//all
		        break;
		case 2: StudentInfo.insertStudentInfo();
		        break;
		case 3: StudentInfo.updateStudentInfo(); 
		         break;
		case 4:StudentInfo.deleteStudentInfo();
		         break;
		case 5: StudentInfo.selectStudentInfo();
		         break;
		 default:System.out.println("Invalid choice");
		} //switch
		
		System.out.println("Do you want to continue yes/no");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("no")) {
			break;
		} //if
		
		}//while end
		System.out.println("Program Terminated");
	}
}

	 //main
