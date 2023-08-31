/*		Day Three Question Five:
 * 		Create three new types of exceptions. 
 * 		Write a class with a method that throws all three. 
 * 		In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */

package main.Days.DayThree.Questions.Q5;
class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    public CustomException3(String message) {
        super(message);
    }
}

class ExceptionThrower {
    public void throwAllExceptions() throws CustomException1, CustomException2, CustomException3 {
        throw new CustomException1("Custom Exception 1");
    }
}
public class QuestionFive {
	
	public void start() {
		ExceptionThrower throwerOne=new ExceptionThrower();
		try {
			throwerOne.throwAllExceptions();
		}catch(CustomException1 | CustomException2| CustomException3 e) {
			System.out.println("Caught custom exception "+ e.getMessage());
		}
	}

}
