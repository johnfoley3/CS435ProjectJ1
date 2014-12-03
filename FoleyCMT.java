import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

/**
 *  @author John Foley <jpf7324@truman.edu>
 *  @version 0.1
 *  @date 11.23.14
 *
 *  A solution to the common meeting time problem described in P1, written
 *  in Java using jthreads.
 */
public class FoleyCMT {

	public static void main(String[] args) {

		String fileName = "GARBAGE";
		Scanner inputFile;
		Scanner lineScanner;
		ArrayList<Integer> line1 = new ArrayList<Integer>();
		ArrayList<Integer> line2 = new ArrayList<Integer>();
		ArrayList<Integer> line3 = new ArrayList<Integer>();

		if (args.length != 1) {

			// Report the error and quit
			System.out.println("Please enter exactly one argument, the file name.");
			System.exit(0);
		} else {

			fileName = args[0];

			// Fill the lists with the lines from the input file
			try {

				inputFile = new Scanner(new File(fileName));


				lineScanner = new Scanner(inputFile.nextLine());

				while (lineScanner.hasNextInt()) {

					line1.add(lineScanner.nextInt());
				}

				lineScanner = new Scanner(inputFile.nextLine());

				while (lineScanner.hasNextInt()) {

					line2.add(lineScanner.nextInt());
				}

				lineScanner = new Scanner(inputFile.nextLine());

				while (lineScanner.hasNextInt()) {

					line3.add(lineScanner.nextInt());
				}
			} catch (Exception e) {

				// Report the error and quit
				System.out.println("Could not find file " + fileName);
				System.exit(0);
			}
		}

		// Trim off the first number. 
		// It represents how many follow, but we don't need to know that.
		line1.remove(0);
		line2.remove(0);
		line3.remove(0);

		for (int searchNum : line1) {

			Thread t = new Thread(new CommonMeetingTimeFinder(searchNum, line2, line3));
			t.start();
		}
	}
}
