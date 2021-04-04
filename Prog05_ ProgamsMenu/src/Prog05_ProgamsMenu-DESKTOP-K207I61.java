/**
 * <Prog05_ProgramsMenu>
 *
 * CSC 1350 Programming project No 3
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 10/15/2018
 *
 */

import java.util.Scanner;

public class Prog05_ProgamsMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		
		Scanner in = new Scanner (System.in);
		
	do {
			//requesting menu
			System.out.println("INTERESTING PROGRAMS MENU");
			System.out.println("===========================================");
			
			//Easer Calculator
			System.out.println("[A] CALCULATE EASTER DATE");
			
			//Commission Pay
			System.out.println("[B] CALCULATE COMMISSION PAY");
		
			//Calculation Table
			System.out.println("[C] GENERATE CALCUATION TABLE");
			
			// Quit	
			System.out.println("[X] QUIT");
			
			System.out.println("===========================================");
			System.out.print("ENTER MENU OPTION:");
			a = in.nextLine();
			
			if (a.equals("A")) {
				Prog02_EasterCalc();
			}
			else if (a.equals("B")) {
				Prog03_PayCalc();
			}
			else if (a.equals("C")) {
				Prog04_MakeTable();
			}
			else if (a.equals("X")) {
				System.out.print("Thank you");
			}
			
			else 
			{
				while (!(a.equals("A")) && !(a.equals("B")) && !(a.equals("C")) && !(a.equals("X"))) {
					System.out.println("Invalid Input!");
					a = in.nextLine();
				}
				
			}
		} while (!a.equals("X"));
	}
				


	public static void Prog02_EasterCalc()
	{
Scanner in = new Scanner( System.in);
		
		System.out.println("When is Easter, you ask?");
        System.out.print("Enter the year of your choosing: ");
		
        while (!in.hasNextInt()) {
			String badinput = in.next();
			System.out.print("Invalid Input!");
		}
        
        int year = in.nextInt();
        
        while (year <= 0) {
			System.out.println("Invalid Input!");
			year =in.nextInt();
		}
		
        if (year > 0) {
			int y = year;
			int a = y % 19;
			int b = y / 100;
			int c = y % 100;
			int d = b / 4;
			int e = b % 4;
			int g = (8 * b + 13)/25;
			int h = (19 * a + b - d - g + 15) % 30;
			int j = c / 4;
			int k = c % 4;
			int m = (a + 11 * h) / 319;
			int r = (2 * e + 2 * j - k - h + m + 32) % 7;
			
			//Month
			int n = (h - m + r + 90) / 25;
			
			//Day
			int p = (h - m + r + n + 19) % 32;
			
			System.out.printf("In %s, Easter falls on %d/%d. \n", year, n, p);	
			
			} 
       
		
	}
	
	public static void Prog03_PayCalc()
	
	{
		boolean Y = true;
		
		boolean N = false;
		Scanner in = new Scanner (System.in);

		String a = "Sunday";
		String b = "Tuesday";
		String c = "Wednesday";
		String d = "Thursday";
		String e = "Friday";
		String f = "Saturday";
		String g = "Monday";
		double Sunday =0.0;
		double Monday =0.0;
		double Tuesday =0.0;
		double Wednesday =0.0;
		double Thursday =0.0;
		double Friday =0.0;
		double Saturday =0.0;
		String day;
		double salesAmount = 0.0;
		double total;
		
		

	//ask for day of sale
			do
			{
				System.out.println("Enter the day of sale (Sunday, Monday, Tuesday, etc.): ");
				day = in.nextLine();
				
				if ((day.equals(a)) || (day.equals(b)) || (day.equals(c)) || (day.equals(d)) || (day.equals(e)) || (day.equals(f)) || (day.equals(g))) 
					
				{}
				else { 
					do 
					{
					System.out.println("Invalid value!");
					System.out.println("Enter the day of sale (Sunday, Monday, Tuesday, etc.): ");
					day = in.nextLine();
					} 
					while(!((day.equals("Monday")) || (day.equals("Tuesday")) || (day.equals("Wednesday")) || (day.equals("Thursday")) || (day.equals("Friday")) || (day.equals("Saturday")) || (day.equals("Sunday"))));
					}
			//ask for salesAmount
			System.out.println("Enter sales amount: ");
			
			
			while (!in.hasNextDouble()) {
					
					String badInput1 = in.next();
					System.out.println("Invalid Value!");
					
				}
				
				salesAmount = in.nextDouble();
			
			if ((salesAmount < 0.0)) {
				do 
				{
				System.out.println("Invalid value!");
				System.out.println("Enter the sales amount: ");
				salesAmount = in.nextDouble();
				} 
				while(salesAmount <= 0.0);
			}
			//ask is entry is finished & loop
			System.out.println("Are you finished entering sales? (Y/N)");
			String answer = in.nextLine();
			
			if (day.equals("Sunday")) 
			{
				Sunday=+salesAmount;
				
			}
				
				else if (day.equals("Monday")) 
				{
					Monday=+salesAmount;
					
				}
					
					else if (day.equals("Tuesday")) 
					{
						Tuesday=+salesAmount;
						
					}
					else if (day.equals("Wednesday")) 
					{
						Wednesday=+salesAmount;
						
					}
					else if (day.equals("Thursday")) 
					{
						Thursday=+salesAmount;
						
					}
					else if (day.equals("Friday")) 
					{
						Friday=+salesAmount;
						
					}
					else if (day.equals("Saturday")) 
					{
						Saturday=+salesAmount;
						
					}
					else 
					{
						System.out.print("Invalid Input!");
					}
			answer = in.nextLine();
			
			if (answer.equals("Y")) { 
				;break;
			}
			while (!answer.equals("N") && !answer.equals("Y")) {
					System.out.print("Invalid input!");
				answer = in.nextLine();
				}
			if (answer.equals("Y")) { 
				;break;
			}
	
	}while (N == false);
		
			
			//system.out.print statements

			total = Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday;
			double commission = 200 + (0.09 * total);
			System.out.printf("Day             Sales\n");
		
			
			System.out.printf("Sunday       $" + "%,10.2f\n", Sunday);
			System.out.printf("Monday       $" + "%,10.2f\n", Monday);
			System.out.printf("Tuesday      $" + "%,10.2f\n", Tuesday);
			System.out.printf("Wednesday    $" + "%,10.2f\n", Wednesday);
			System.out.printf("Thursday     $" + "%,10.2f\n", Thursday);
			System.out.printf("Friday       $" + "%,10.2f\n", Friday);
			System.out.printf("Saturday     $" + "%,10.2f\n", Saturday);
			System.out.println("            ------------");
			
	        System.out.printf("Sum is:      $" + "%,10.2f\n", total);
			System.out.printf("Average sale value: " + " $%,1.2f\n ", total/7);
			// commission part
			if(total >15000) 
			{
				commission =+ 1000;
			}
				else
				{}
			
			
			if(total >= 60000) 
			{
				System.out.printf("Commission on sales: " + " $%,1.2f *** \n" , commission);
			} 
				else 
				{
					System.out.printf("Commission on sales: " + " $%,1.2f \n", commission);
				}
		
	}
	
	public static void Prog04_MakeTable()
	
	{
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
			System.out.print("    R");
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			}
			System.out.println();
			
			for (a = Smallest; a <= Largest; a++) {
				System.out.printf("%5d", a);
			for (b = Smallest; b <= Largest; b++) {
			int range = b-a + 1;
			int r = (int) (Math.random()* range) + a;	
				System.out.printf("%5d", r);
			}
				System.out.println();
			}
		}
	
	}
	
}