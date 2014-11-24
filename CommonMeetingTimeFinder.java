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
	private ArrayList<Integer> meetingTimes = new ArrayList<Integer>();

	public CommonMeetingTimeFinder(ArrayList<Integer> meetingTimes) {

		this.meetingTimes = meetingTimes;
	}

	/**
	 *	Sets the search number 
	 */
	public void setSearchNum(int numToSearchFor) {

		searchNum = numToSearchFor;
	}

	/**
	 *	Searches for the number in a list.
	 *	@return boolean True if found
	 */
	public boolean findNum() {

		for (Integer num: meetingTimes) {

			if (num == searchNum) return true;
		}
		return false;
	}

	/**
	 *	Implements the actual search through the list
	 */
	public void run() {

		System.out.println("A thread has started.");
	}

}