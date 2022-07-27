package project_1;

import java.util.Iterator;

public class loops {
	public static void main(String[] args) {
		// 1. For loop 
		System.out.println("\n\n----For Loop----");
		for(int i=1 ; i<=5 ;i++)
		{
			System.out.println("\ni = " +i);
		}
		
		//2. While loop 
		System.out.println("\n\n----While loop----");
		int a=1;
		while(a<=5)
		{
			System.out.println("\nj = "+a);
			a++;
		}
		
		//3. Do while loop 
		System.out.println("\n\n----Do while loop----");
		int k= 1;
		do {
			System.out.println("\nK = " +k);
			k++;
		}
		while(k<=5);
		
		
		// pattern 1
		System.out.println("\n\n----- Pattern 1 -----\n");
		for(int i=1;i<=5;i++)
		{
			for(int l=1;l<=i;l++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		// pattern 2
		
		System.out.println("\n\n ----- Pattern 2 -----\n");
		
		for(int i=1; i<=5;i++)
		{
			for(int l=5 ;l>=i;l--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		// pattern 3 
		 System.out.println("\n\n ----- Pattern 3 -----\n");
		 
		 for(int i= 1 ;i <=5 ;i++)
		 {
			 for(int j=1 ; j<=i ;j++)
			 {
				 System.out.print(" "+i);
			 }
			 System.out.println(" ");
		 }
		 
		 
		// pattern 4
		System.out.println("\n\n ----- Pattern 4 -----\n");
				 
		for(int i= 1 ;i <=5 ;i++)
		{
			for(int j=5 ; j>=i ;j--)
			{
				 System.out.print(" "+i);
			}
			System.out.println(" ");
		}
		
		//Pattern 5 
		System.out.println("\n\n ----- Pattern 5 -----\n");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{  
				if((i+j)<=5)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println(" ");
		}
		
		//pattern 6 
		System.out.println("\n\n ----- Pattern 6 -----\n");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
