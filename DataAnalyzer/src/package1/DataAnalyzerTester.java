package package1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class DataAnalyzerTester {

	public static void main(String[] args) {
		String fileName;

		Scanner scan = new Scanner(System.in); // scanner object
		LinkedList<Integer> numlist = new LinkedList(); // list object

		System.out.println("Please enter one number at a time");
		System.out.println("type any letter to exit");

		while (scan.hasNextInt()) {
			numlist.add(scan.nextInt());
		}

		DataAnalyzer da = new DataAnalyzer(numlist); // creates dataAnalyzer

		fileName = args[0];
		File myfile = new File(fileName + ".txt"); // creates file obj.

		try {
			if (!myfile.exists()) {
				myfile.createNewFile();
			}
				PrintWriter pw = new PrintWriter(myfile); // creates printWriter
															// obj
				for (int x : numlist) {
					pw.println(x); // prints in into file
				}
				int min = da.computeMin(numlist); // gets min
				int max = da.computeMax(numlist); // gets max
				double avg = da.computeAvg(numlist); //gets avg

				System.out.println("The minimum = " + min);
				System.out.println("The maximum = " + max);
				System.out.println("The average = " + avg);

				pw.write("The minimum = " + min);
				pw.println();
				pw.write("The maximum = " + max);
				pw.println();
				pw.write("The average = " + avg);
				pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File done");
	}

	private int nums;
	private int input;
}
