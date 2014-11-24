import java.io.BufferedReader;
import java.io.FileReader;

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
		BufferedReader inputFile;

		if (args.length != 1) {

			System.out.println("Please enter exactly one argument, the file name.");
			System.exit(0);
		} else {

			fileName = args[0];

			try {

				inputFile = new BufferedReader(new FileReader(fileName));
			} catch (Exception e) {

				System.out.println("Could not open " + fileName);
			}
		}
	}
}