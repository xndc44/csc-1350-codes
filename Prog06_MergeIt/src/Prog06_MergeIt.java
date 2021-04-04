import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Prog06_MergeIt {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		boolean filesboo = true;
		Scanner in = new Scanner (System.in);
		Scanner first = null;
		Scanner second = null;
		
		//firstfile
		System.out.print("Enter the first file's name:");
		String firstFile = in.nextLine();
		System.out.println("");
		do {
			System.out.println("");
            try {
                first = new Scanner(new File(firstFile));
                filesboo = false;
            } 
            catch (FileNotFoundException ex) {
                System.out.printf("File specified <%s> does not exist. Would you like to continue? <Y/N> ", firstFile);
                if (in.nextLine().toLowerCase().equals("n")) {
                    throw ex;
                }
                System.out.println();
            }
        }
        while (!filesboo);

		
		//secondfile
		System.out.print("Enter the second file's name:");
		String secondFile = in.nextLine();
		System.out.println("");
		do {
			System.out.println("");
            try {
                second = new Scanner(new File(secondFile));
                filesboo = false;
            } 
            catch (FileNotFoundException ex) {
                System.out.printf("File specified <%s> does not exist. Would you like to continue? <Y/N> ", secondFile);
                if (in.nextLine().toLowerCase().equals("n")) {
                    throw ex;
                }
                System.out.println();
            }
        }
        while (!filesboo);
		
		AorderedList one = new AorderedList();
		one.firstinput(first);
		one.secondinput(second);
		
	}//main
}//class