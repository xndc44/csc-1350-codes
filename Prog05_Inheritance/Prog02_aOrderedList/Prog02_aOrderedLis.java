

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;


public class Prog02_aOrderedLis {
	
	
	public static Scanner GetinputFile(String UserPrompt) throws FileNotFoundException {
		
		Scanner fileScanner = null;                       
		boolean	inFile = true;
		
        do {
            System.out.print(UserPrompt);
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            System.out.println();
            
            try {
                fileScanner = new Scanner(new File(fileName));
                inFile = false;
            }//try
            catch (FileNotFoundException ex) {
                System.out.printf("File specified <%s> does not exist. Would you like to continue? <Y/N> ", fileName);
                if (in.nextLine().toLowerCase().equals("n")) {
                    throw ex;
                }//if
                System.out.println();
            }//catch
        }//do
        while (inFile);
        
        return fileScanner;
	}//inputfile
	

    public static PrintWriter outFilewrite(String userPrompt) throws FileNotFoundException {

    	PrintWriter writetofile = null;                    
    	boolean	outfile = true;
        
        do {
            System.out.println("Enter output filename: ");
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            System.out.println();
            try {
                writetofile = new PrintWriter(fileName);
                outfile = false;
            } //try
            catch (FileNotFoundException ex) {
                System.out.printf("File specified <%s> does not exist. Would you like to continue? <Y/N>", fileName);
                if (in.nextLine().toLowerCase().equals("n"))
                    throw ex;
                System.out.println();
            }//catch
            
        }//do
        while (outfile);
        
        return writetofile;
        
    }//outFilewrite

    public static void main(String[] args) {

        Scanner fileScanner;                        
        PrintWriter writetofile;                     
        aOrderedList list = new aOrderedList();     

        try {
        	
        	fileScanner = intFile("Enter input filename: ");

	        
	        while(fileScanner.hasNextLine()) {
	            String[] elements = fileScanner.nextLine().split(",");
	            if (elements[0].equals("A")) {
	                list.add(new Car(elements[1], Integer.parseInt(elements[2]), Integer.parseInt(elements[3])));
	            }//if
	            else if (elements[0].equals("D")) {
	                for(int i = 0; i < list.size(); i++) {
	                    Car element = (Car)list.get(i);
	                    if (element.getMake().equals(elements[1]) && element.getYear() == Integer.parseInt(elements[2])) {
	                        list.remove(i);
	                    }//if
	                }//for
	            }//elseif
	        }//while
	
	        
	        
	        writetofile = outFilewrite("Enter output filename: ");
	
	        
	        writetofile.append(String.format("Number of cars:%6s%n", list.size()));
	        for(int i = 0; i < list.size(); i++) {
	            Car item = (Car)list.get(i);
	            writetofile.append(String.format("%nMake:%12s%n", item.getMake()));
	            writetofile.append(String.format("Year:%12d%n", item.getYear()));
	
	
	            NumberFormat formatter = NumberFormat.getCurrencyInstance();
	            String priceString = formatter.format(item.getPrice());
	            writetofile.append(String.format("Price:%11s%n%n", priceString.substring(0, priceString.length() - 3)));
	        }//for
	        writetofile.close();
	    }//try
	    catch (FileNotFoundException ex) {
	    	System.out.println("User terminated program");
	    }//catch


    }//main


}//Prog02_aOrderedList class

