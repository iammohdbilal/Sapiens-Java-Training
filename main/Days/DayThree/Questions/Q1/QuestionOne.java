
/*Day Three Question One: 
 * 1.	Create a class with a main( ) that throws an object of class Exception inside a try block. 
 * 		Give the constructor for Exception a String argument. 
 * 		Catch the exception inside a catch clause and print the String argument. 
 * 		Add a finally clause and print a message to prove you were there.
 */

package main.Days.DayThree.Questions.Q1;

import main.Days.DayThree.Questions.Q1.Interface.QuestionOneINF;

class ExceptionHandler implements QuestionOneINF{
	public void handleException(String message) {
		System.out.println("Exception: "+ message + " that has been caught");
	}
}

public class QuestionOne {
	public void start() {
		try {
			throw new Exception("This is a custom exception");
		}catch(Exception e){
			QuestionOneINF handler=new ExceptionHandler();
			handler.handleException(e.getMessage());
		}finally {
			System.out.println("Block executed");
		}
	}

}
