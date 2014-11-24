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
	 *	Sets the search number 
	 */
	public void setNum(int numToSearchFor) {

		searchNum = numToSearchFor;
	}

	/**
	 *	Implements the actual search through the list
	 */
	public void run() {

	}

}