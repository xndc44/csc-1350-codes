/**
 * <Prog07>
 *
 * CSC 1350 Programming project No 7
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 11/23/2018
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.PrintWriter;
import java.util.Arrays;

public class prog07 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub	
		try {
			int [] grade = array();
			BubbleSort(grade);
			result(grade);
			binarySearch(grade);
		}//try
		
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}//catch
		
		catch (SecurityException e) {
			System.out.println("x");
		}//catch		
			
	}//main
		
		public static int[] array() throws FileNotFoundException { 
					JFileChooser chooser = new JFileChooser();
			Scanner in = null;
			//while loop
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			
				File selectedFile = chooser.getSelectedFile();
				in = new Scanner(selectedFile);
			
			}//if Jfilechooser
			int [] array = new int[in.nextInt()];
			
			while (in.hasNextInt()) {
				for (int i = 0; i < array.length; i++) {
					array[i] = in.nextInt();
				}//for
			}//while
			in.close();
			
			return array;
		} //int array method
		
		public static int[] BubbleSort (int[] array) {
			boolean sorted = false;
			int i = 1;
			while (!sorted) {
				if (i == array.length) {
					sorted = true;
				}//if
				else {
					sorted = true;
					for(int j = 0; j < array.length-i; j++){
						if(array[j] < array[j+1]) {
							swap(array, j, j+1);
							sorted = false;
						}//if
					}//for
				}//else
				i++;
			}//while
			return array;
		}//bubbleSort
	
		public static int [] swap( int[] grades, int i, int j) {
			
			int temp = grades[i];
			grades[i] = grades[j];
			grades[j] = temp;
			
			return grades;
		}//grades
		
		public static void result (int[] grade) throws FileNotFoundException {
			
			JFileChooser chooser = new JFileChooser();
			
			if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				File outFile = chooser.getSelectedFile();
				PrintWriter out = new PrintWriter(outFile);
				
				for (int i = 0; i < grade.length; i++) {
					out.println(grade[i]);
				}//for
				
				// min, max, mean, & median
				
				double largest = grade[0];
				for (int i = 1; i < grade.length; i++) {
					if (grade[i] > largest) {
						largest = grade [i];
					}//if
				}//for max
				
				double smallest = grade [0];
				for (int i = 1; i < grade.length; i++) {
					if (grade [i] < smallest) {
						smallest = grade [i];
					}//if
				}//for min
				
				 double sum = 0;
				    for (int i = 0; i < grade.length; i++) {
				        sum += grade[i];
				    }
				//mean
				
				double median = (smallest + largest)/2;
			
				//counter grade amounts
				
				int counta = 0;
				int countb = 0;
				int countc = 0;
				int countd = 0;
				int countf = 0;
				
				
				for (int i = 0; i < grade.length; i++) {
					if (grade [i] >= 90) {
						counta+=1;
					}
					if (grade [i] < 90 && grade[i] >= 80) {
						countb+=1;
					}
					if (grade [i] < 80 && grade[i] >= 70) {
						countc+=1;
					}
					if (grade [i] < 70 && grade[i] >= 60) {
						countd+=1;
					}
					if (grade [i] < 60) {
						countf+=1;
					}
				}// for counter
				
				//system.out statements
				
				out.println();
				out.println();
				out.println();
				out.print("Mean:  ");
				out.println(sum/grade.length);
				out.print("Median:  ");
				out.println(median);
				out.print("Minimum:  ");
				out.println(smallest);
				out.print("Maxmimum:  ");
				out.println(largest);
				out.print("Number of As:  ");
				out.println(counta);
				out.print("Number of Bs:  ");
				out.println(countb);
				out.print("Number of Cs:  ");
				out.println(countc);
				out.print("Number of Ds:  ");
				out.println(countd);
				out.print("Number of Fs:  ");
				out.println(countf);
				out.print("Total Number of Grades:  ");
				out.print(counta+countb+countc+countd+countf);
				
			out.close();	
			}//if							
		}//grade
		
		public static void binarySearch(int[] grade) {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Enter target");
			int target = in.nextInt();
			int min = 0;
			int max = grade.length - 1;
			int retVal = -1;
			int mid =0;
			while ((min <= max) && (retVal < 0)) {
				mid = (min + max) / 2;
				if (grade[mid] > target) {
					min = mid + 1;
				} 
				else if (grade[mid] < target) {
					max = mid - 1;
				} 
				else {
					retVal = mid;
					System.out.print(mid);
				}
				
			}
			if (retVal != mid) {
				System.out.println("0");
				System.out.print("Value is not in the array.");
			}
		}	
	}//class
