
package main.Days.DayTwo.Questions.Q9;
import java.util.Date;
import main.Days.DayTwo.Questions.Q9.Interface.*;

class BasicDateTimeProvider implements questionNineINF {
    public String getCurrentDateTime() {
        Date date = new Date();
        return date.toString();
    }
}

public class QuestionNine {
	public void start() {
		 questionNineINF dateTimeProvider = new BasicDateTimeProvider();
	        String currentDateTime = dateTimeProvider.getCurrentDateTime();
	        
	        System.out.println("Current full date and time: " + currentDateTime);
	}
	

}
