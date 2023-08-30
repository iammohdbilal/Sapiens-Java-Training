package main.Days.DayTwo.Questions.Q1;
import main.Days.DayTwo.Questions.Q1.Interface.*;
import java.util.Scanner;
class Square implements questionOneINF{
	public void draw() {
		System.out.println("Drawing square");
	}
}

class Circle implements questionOneINF{
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class Hexagon implements questionOneINF{
	public void draw() {
		System.out.println("Drawing Hexagon");
	}
}
public class QuestionOne {
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape you want to draw");
		String shapeChoice=sc.nextLine();
		switch(shapeChoice) {
		case "circle":
			questionOneINF circle1=new Circle();
			circle1.draw();
			break;
		case "square":
			questionOneINF square1=new Square();
			square1.draw();
			break;
		case "hexagon":
			questionOneINF hexagon1=new Hexagon();
			hexagon1.draw();
			break;
			default:
				System.out.println("Invalid shape");
			
		}
		sc.close();
	}
	

}
