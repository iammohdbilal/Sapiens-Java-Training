package main.Days.DayTwo.Questions.Q6;
import main.Days.DayTwo.Questions.Q6.Interface.*;

class BasicStringLengthCalculator implements questionSixINF {
    public int calculateLength(String str) {
        return str.length();
    }
}

public class QuestionSix {
	
	public void start() {
String inputString = "SAPIENS TECHNOLOGIES";
        
        questionSixINF calculator = new BasicStringLengthCalculator();
        int length = calculator.calculateLength(inputString);
        
        System.out.println("Length of the string: " + length);
	}
	
	

}
