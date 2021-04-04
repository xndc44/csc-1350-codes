/**
 * <Prog06_MakeMagic>
 *
 * CSC 1350 Programming project No 3
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 10/1/2018
 *
 */
import java.util.Scanner;
public class a {
public static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		boolean x = true;
		
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
		magicSquare();
		
	}
	
	public static void magicSquare () {
		int row = n - 1 ;
		int column  = n/2;
		int[][] a = new int [row] [column];
		
		for (row = 0; row <= n; row++) {
			for (column = 0; column <= n; column++)
				System.out.print(a[row][column]+" "); 
			System.out.println();
		}
			
			
		
	}
	
}
