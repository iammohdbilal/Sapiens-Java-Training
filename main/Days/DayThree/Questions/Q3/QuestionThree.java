/*3.	Day Three Question Three:
 * 		Write code to generate and catch an ArraylndexOutOfBoundsException.*/

package main.Days.DayThree.Questions.Q3;



public class QuestionThree {
	public void start() {
		try {
			int[] arr=new int[10];
			arr[15]=41;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds! " + e.getMessage());
		}
	}

}
