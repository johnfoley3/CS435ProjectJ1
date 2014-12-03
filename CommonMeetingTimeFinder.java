import java.util.ArrayList;

/**
 * @author John Foley <jpf7324@truman.edu>
 * @date 11/23/14
 *
 * Class to implement a thread that searches through a list for common
 * meeting times between the other threads
 */

public class CommonMeetingTimeFinder implements Runnable {

	/**
	 *	The number to look for
	 */
	private int searchNum = 0;

	/**
	 *	List of meeting times
	 */
	private ArrayList<Integer> line2 = new ArrayList<Integer>();
	private ArrayList<Integer> line3 = new ArrayList<Integer>();

	/**
	 * Constructs a CommonMeeting Time Finder
	 *
	 * @param searchNum number to search for
	 * @param line2 second line to search through
	 * @param line3 third line to search through
	 */
	public CommonMeetingTimeFinder(int searchNum, ArrayList<Integer> line2, ArrayList<Integer> line3) {

		this.searchNum = searchNum;
		this.line2 = line2;
		this.line3 = line3;
	}

	/**
	 *	Implements the actual search through the list
	 */
	public void run() {

		// search line 2
		for (Integer num: line2) {

			if (num == searchNum) {

				// search line 3
				for (Integer num2: line3) {

					if (num2 == searchNum) {
						System.out.println(num2 + " is a common meeting time.");
						return;
					}
				}
			}
		}

		return;
	}

}