/**
 * <Prog03_PayCalc>
 *
 * CSC 1350 Programming project No 3
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 10/1/2018
 *
 */

import java.util.Scanner;

public class Prog04_MakeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner in = new Scanner (System.in);
		boolean No = false;
		int a;
		int b;
		
		//ask for Table operator
		System.out.print("Enter The Table Operator (+, -, *, /, %, or R): ");
		String operator = in.nextLine();
		
		while (!((operator.equals("+")) || (operator.equals("-"))  || (operator.equals("*")) || (operator.equals("/")) || (operator.equals("%")) || (operator.equals("R"))))
		{
			System.out.println("Invalid Value!");
			System.out.println("Enter The Table Operator (+, -, *, /, %, or R): ");
			operator = in.nextLine();
		}
		
		
		//ask for Smallest Operand
		System.out.print("Enter The Smallest Operand For the Table: ");
			
		while (!in.hasNextInt()) 
		{
				
			String badInput = in.next();
			System.out.println("Invalid Value!");
			System.out.println("Enter The Smallest Operand For the Table: ");
				
		}
			
		int Smallest = in.nextInt();
		
		//ask for Largest Operand
		System.out.print("Enter The Largest Operand For the Table: ");
		while (!in.hasNextInt()) 
		{
			
			String badInput1 = in.next();
			System.out.println("Invalid Value!");
			System.out.println("Enter The Largest Operand For the Table: ");
			
		}
		
		int Largest = in.nextInt();
		System.out.println();
		
		
		
		if (operator.equals("+")) 
		{
			System.out.print("    +");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			
		for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					System.out.printf("%5d", a+b);
				}
			System.out.println();
			}
		}
		
		else if (operator.equals("-")) 
		{
			System.out.print("    -");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			
		for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					System.out.printf("%5d", b-a);
				}
			System.out.println();
			}
		
		
		}
		else if (operator.equals("*")) 
		{
			System.out.print("    *");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			
		for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					System.out.printf("%5d", a*b);
				}
			System.out.println();
			}
		
		
		}
		else if (operator.equals("/")) 
		{
			System.out.print("    /");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();			
	
			
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					if (a == 0) {
						System.out.printf("    -");
					} 
					else if (a != 0) {		
				System.out.printf("%5d", b/a);					
				}
				}		
			System.out.println();
				
			
			}
			
		
		}
		
		else if (operator.equals("%")) 
		{
			System.out.print("    %");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			
		for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					System.out.printf("%5d", b%a);
				}
			System.out.println();
			}
		
		
		}
		
		else if (operator.equals("R")) 
		{
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			
		for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
				for (b = Smallest; b <= Largest; b++) {
					System.out.printf("%5d", a+b);
				}
			System.out.println();
			}
		
		
		}
	}
}

