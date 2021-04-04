/**
 * <Prog07_part2>
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

public class Prog07_part2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		
			File selectedFile = chooser.getSelectedFile();
			in = new Scanner(selectedFile);
		
		}
	
	}

}
