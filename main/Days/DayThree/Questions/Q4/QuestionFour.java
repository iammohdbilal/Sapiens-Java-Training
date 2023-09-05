/* 		Day Three Question Four:
 * 		Create your own exception class using the extends keyword. 
 * 		Write a constructor for this class that takes a String argument and stores it inside the object with a String reference. 
 * 		Write a method that displays the stored String. 
 * 		Create a try-catch clause to exercise your new exception.
 */

package main.Days.DayThree.Questions.Q4;

class CustomException extends Exception{
	private String message;
	public CustomException(String message) {
		this.message=message;
	}
	
	public void displayMessage() {
		System.out.println("This is the custom exception message!");
	}
}

public class QuestionFour {
	
	public void start() {
		try {
			throw new CustomException("This is a custom exception");
		}catch(CustomException e) {
			System.out.println("This is the exception being caught");
			e.displayMessage();
		}
	}

}
