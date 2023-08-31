package main.Days.DayThree;

import main.Days.DayThree.Questions.Q1.QuestionOne;
import main.Days.DayThree.Questions.Q2.QuestionTwo;
import main.Days.DayThree.Questions.Q3.QuestionThree;
import main.Days.DayThree.Questions.Q4.QuestionFour;
import main.Days.DayThree.Questions.Q5.QuestionFive;

public class DayThree {
	int qno;
	public DayThree(int qno) {
		this.qno=qno;
	}
	
	public void start() {
		switch(qno) {
		case 1:
			QuestionOne objOne=new QuestionOne();
			objOne.start();
			break;
		case 2:
			QuestionTwo objTwo=new QuestionTwo();
			objTwo.start();
			break;
		case 3:
			QuestionThree objThree=new QuestionThree();
			objThree.start();
			break;
		case 4:
			QuestionFour objFour=new QuestionFour();
			objFour.start();
			break;
		case 5:
			QuestionFive objFive=new QuestionFive();
			objFive.start();
			break;
		default:
			System.out.println("Invalid question choice!");
			break;
		}
	}

}
