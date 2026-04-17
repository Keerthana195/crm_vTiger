package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This a utility class which stores the functionality from java library
 * @author Keerthana
 * @version 26-03-25
 */
public class JavaUtility {
	/**
	 * This is a genric method used to fetch calendar details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
    /**
     * This is generic method to generate random number
     * @param bound 
     * @return
     */
	public int getRandomNumber() {
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}

}
