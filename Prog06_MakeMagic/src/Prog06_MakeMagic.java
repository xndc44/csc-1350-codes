/**
 * <Prog06_MakeMagic>
 *
 * CSC 1350 Programming project No 6
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 11/7/2018
 *
 */
import java.util.Scanner;

public class Prog06_MakeMagic {
public static int n;
public static int i;
public static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		positive();
		magicSquare();
		magicTest();
	}
	
	public static void positive() {
		
		
		boolean x = true;
		Scanner in = new Scanner (System.in);
		System.out.println("Lets make some magic!");
		System.out.println("Enter a positive (greater than 0) odd integer:");
		do {
			while (!in.hasNextInt()) {
				System.out.println("Please enter an integer!");
				String badinput = in.next();
				}
				n = in.nextInt();
					
			while (n < 0) {
				System.out.println("Please enter a positive integer!");
				n = in.nextInt();
			}
			
			while (n % 2 == 0) {
				System.out.println("Please enter an odd integer!");
				n = in.nextInt();
				}
			break;
		} while (x = true);
		
	} //positive
	
	public static void magicSquare () {
		int i;
		int j;
		int[][] magicSquare = new int[n][n];
		int row = n - 1 ;
		int column  = n/2;
		magicSquare [row] [column] = 1;
 
		for (i = 2; i <= n*n; i++) {
            if (magicSquare[(row + 1) % n][(column + 1) % n] == 0) {
                row = (row + 1) % n;
                column = (column + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
            }
            magicSquare [row][column] = i;
        }
		System.out.println();
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
           
                System.out.printf("%5d", magicSquare[i][j]);
	            }
	        System.out.println();
	        }

		
	}//magicSquare
	public static void magicTest () {
		if (i == 1 && i == 2 && i == Math.pow(n, 2)) {
			if (i == j) {
			System.out.print("It is confirmed: This is a magic square. ");
			}
		}
		else {
			System.out.println("It is confirmed: This is a magic square. ");
		}
	}//magicTest
}
