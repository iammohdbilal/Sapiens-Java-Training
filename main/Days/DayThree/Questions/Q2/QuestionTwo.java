/*Day Three Question Two:
 * 2.	Define an object reference and initialize it to null. 
 * 		Try to call a method through this reference. 
 * 		Now wrap the code in a try-catch clause to catch the exception.
 */


package main.Days.DayThree.Questions.Q2;

import main.Days.DayThree.Questions.Q2.Interface.QuestionTwoINF;

public class QuestionTwo {
	public void start() {
		QuestionTwoINF questionTwoObject=null;
		try {
			questionTwoObject.myMethod();
		}catch (NullPointerException e) {
			System.out.println("NullPointerException caught:" + e.getMessage());
		}
	}

}
