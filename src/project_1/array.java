package project_1;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		//simple array
		int arr[]= {1,2,3,4,5};
		for(int index=0;index<arr.length;index++)
		{
			System.out.println("Value at array["+index+"] is "+arr[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size of array :-");
		int size = sc.nextInt();
		int a[] = new int[size];
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\nEnter element at index["+i+"]:-");
			a[i]=sc.nextInt();
			
			//sum of array
			sum=sum+a[i];
		}
		System.out.println("\nsum = " +sum);
		
		//element found or not 
		System.out.print("\nEnter the number:-");
		int num = sc.nextInt();
		int counter=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				counter++;
			}
		}
		if(counter == 1)
		{
			System.out.println(" Number is Found");
		}
		else
		{
			System.out.println(" number is Not found");
		}
		
		// ascending order
						
		for(int i=0;i<size;i++)		   
		{					         
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j]) 
				{
					counter=a[i];  
					a[i]=a[j];    
					a[j]=counter; 
				}
			}
			System.out.println("The ascending order is:-"+a[i]);
		}
		
	}
}
