package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excaption_demo {
	public static void main(String[] args) {
		int i ,j , k;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter i :-");
			i= sc.nextInt();
			System.out.println("Enter j:-");
			j= sc.nextInt();
			k= i/j;
			System.out.println("Division is :-"+k);
			System.exit(0); // to exit the code when try conditions is right. 
			
		} 
		catch (ArithmeticException e) {
		System.out.println("denominator cannot be zero");
	} catch (InputMismatchException e) {
		System.out.println("denominator cannot be string");
		}catch (Exception e) {
			e.printStackTrace(); //or
			System.out.println("Error");
			
		}
		finally {
			System.out.println("This will Executes everytime.");
			//when in try system.exit are not available this code is execute every time.
		
		}
	}
}
