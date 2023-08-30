package main.Days.DayTwo;

import main.Days.DayTwo.Questions.Q1.QuestionOne;
import main.Days.DayTwo.Questions.Q10.QuestionTen;
import main.Days.DayTwo.Questions.Q2.*;
import main.Days.DayTwo.Questions.Q3.QuestionThree;
import main.Days.DayTwo.Questions.Q4.QuestionFour;
import main.Days.DayTwo.Questions.Q5.QuestionFive;
import main.Days.DayTwo.Questions.Q6.QuestionSix;
import main.Days.DayTwo.Questions.Q7.QuestionSeven;
import main.Days.DayTwo.Questions.Q9.QuestionNine;

public class DayTwo {
 int qno;
public DayTwo(int qno) {
	this.qno=qno;
}

public void start() {
	switch (qno) {
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
	case 6:
		QuestionSix objSix=new QuestionSix();
		objSix.start();
		break;
	case 7:
		QuestionSeven objSeven=new QuestionSeven();
		objSeven.start();
		break;
	case 8:
		break;
	case 9:
		QuestionNine objNine=new QuestionNine();
		objNine.start();
		break;
	case 10:
		QuestionTen objTen=new QuestionTen();
		objTen.start();
		break;
	}
}


}
