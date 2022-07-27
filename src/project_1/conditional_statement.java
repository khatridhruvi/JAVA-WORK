package project_1;

import java.util.Scanner;

public class conditional_statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number A :-");
		int a = sc.nextInt();
		System.out.print("Enter the number B :-");
		int b = sc.nextInt();
		
		// 1. Simple if statement
		System.out.println("\n\n-----Simple loop-----");
		if (a>b) {
			System.out.println("\nA is Greater than B");
		}
		
		// 2. else if statement 
		System.out.println("\n\n-----else if  loop-----");
		if (a>b) {
			System.out.println("\nA is Greater than B ");
		}
		else
		{
			System.out.println("\nB is Greater than A ");
		}
		
		// 3. nested if else 
		System.out.println("\n\n-----nested loop-----");
		System.out.print("\nEnter the age :-");
		int age = sc.nextInt();
		
		if (age>18) {
			if (age<60) {
				System.out.println("\nYou are eligible for donation");
			}
			else {
				System.out.println("\nYour age is greater than 18 but not less than 60");
			}
		}
		else {
			System.out.println("\nAge is less than 18");
		}
		
		//4. else if else statement 
		
		System.out.println("\n\n-----else if  else  loop-----");
		System.out.print("\nEnter the percentage :-");
		int per = sc.nextInt();
		
		 if (per<35) {
			System.out.println("You are fail ");
		    }
		 else if (per >= 35 && per <=50) {
			 System.out.println("D grade");
		 }
		 else if (per >= 51 && per <=70) {
			 System.out.println("C grade");
		 }
		 else if (per >= 71 && per <=80) {
			 System.out.println("B grade");
		 }
		 else if (per >= 81 && per <=90) {
			 System.out.println("A grade");
		 }
		 else if (per >= 91 && per <=100) {
			 System.out.println("A++ grade");
		 }
		 else {
			System.out.println("invalid input");
		}
		 
		// 5.
		 System.out.println("\n\n----- Switch case -----");
		 System.out.println("\n1 English 2. Hindi 3. Gujarati");
		 System.out.print("\nEnter the choice :-");
		 int lang = sc.nextInt();
		 
		 switch (lang) {
		case 1: 
			System.out.println("You selected English ");
			break;
		case 2: 
			System.out.println("You selected Hindi ");
			break;
		case 3: 
			System.out.println("You selected Gujarati ");
			break;
		default:
			System.out.println("Invalid input");
		}
		 
		 
	}
}
