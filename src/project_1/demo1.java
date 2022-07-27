package project_1;

import java.util.Scanner; // for the scanner class 

class first{
	public void run() {
		System.out.println("Hello run method");
	}
}
	
public class demo1 {
	public static void main(String[] args) {
		//Basic print concept 
			first f1=new first();
			f1.run();
	
			System.out.println("Hello world");
			System.out.println("Hello Java");
			System.out.println("Hello\"JAva\" again");
		
		// User input process
			System.out.println("\n\n-----User input process-----");
			int i,j;
			Scanner sc = new Scanner(System.in); //  syntax of scanner 
			System.out.print("\nEnter the value of i = ");
			i= sc.nextInt();
			System.out.print("Enter the value of j = ");
			j=sc.nextInt();
			System.out.println("i= "+i);
			System.out.println("j= "+j);
		
		//All Arithmetic operations 
			System.out.println("\n\n-----Arithmetic operations-----");
			int a = i+j;
			System.out.println("\nAddition of i and j is :- " +a);
			int b = i-j;
			System.out.println("Subtraction of i and j is:- " +b);
			int c = i*j;
			System.out.println("Multiplication of i and j is :- " +c);
			float  d= i/j;
			System.out.println("Division of i and j is :- " +d);
			
			System.out.println("Modulo of i and j is :- " +(i%j) );
		
		//This is for find the percentage
		    System.out.println("\n\n-----Percentage of marks-----");
			System.out.print("\nEnter the marks1 :- ");
			float m1 = sc.nextFloat();
			System.out.print("Enter the marks2:- ");
			float m2 = sc.nextFloat();
			float per =(m1+m2)*100/200;
			System.out.println("percentage is :- " +per );
		
		// Area of triangle 
			
			float B,H,area,area1;
			System.out.print("\nEnter the number:- ");
			B = sc.nextFloat();
			System.out.print("Enter the number:- ");
			H = sc.nextFloat();
			
			System.out.println("\n\n-----Area of triangle----- ");
	        area=(B*H)/2;
			System.out.print("\nThe area of triangle is :- " +area);
	
		// Area of Rectangle
			System.out.println("\n\n-----Area of Rectangle-----");
			area1=B*H;
			System.out.println("\nThe area of rectangle is :- " +area1);
			
		//Area of square
			System.out.println("\n\n -----Area of square-----");
			System.out.println("\nThe area of square is :- " +(B*B));
			
		//char 
			System.out.print("Enter character:-");
			char ch = sc.next().charAt(0);
			System.out.println(ch);
	}
}

