package main.Days.DayOne;


import main.Days.DayOne.Questions.QuestionFour;
import main.Days.DayOne.Questions.QuestionOne;
import main.Days.DayOne.Questions.QuestionThree;
import main.Days.DayOne.Questions.QuestionTwo;

public class DayOne {
	int qno;
	public DayOne(int qno) {
		this.qno=qno;
	}
	
	public void start() {
		switch(qno) {
		case 1:
			QuestionOne Obj1=new QuestionOne();
			Obj1.takeInput();
			break;
		case 2:
			QuestionTwo Obj2=new QuestionTwo();
			Obj2.takeInput();
			break;
		case 3:
			QuestionThree Obj3=new QuestionThree();
			Obj3.takeInput();
			break;
		case 4:
			QuestionFour Obj4=new QuestionFour();
			Obj4.takeInput();
			break;
		}
	}
}
