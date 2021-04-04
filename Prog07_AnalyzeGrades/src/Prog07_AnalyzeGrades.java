/**
 * <Prog07_AnalyzeGrades>
 *
 * CSC 1350 Programming project No 7
 * Section 7
 *
 * @author <Patrick Adeosun>
 * @since 11/13/2018
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Prog07_AnalyzeGrades {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		int [] grade = array();
		
	}
	
	public static int[] array() throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		
			File selectedFile = chooser.getSelectedFile();
			in = new Scanner(selectedFile);
		
		}
		int [] array = new int[in.nextInt()];
		
		while (in.hasNextInt()) {
			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}
		}
		in.close();
		
		return array;
	}
	
}
