package main.Days.DayTwo.Questions.Q2;

import main.Days.DayTwo.Questions.Q2.Interface.questionTwoINF;

 class parent implements questionTwoINF{
	public String s=new String();
	public void print() {
		s="This is parent class";
		System.out.println(s);
	}
}

class child extends parent{
	public String s=new String();
	public void print() {
		s="This is child class";
		System.out.println(s);
	}
}






public class QuestionTwo  {
	public void start() {
		parent parentObj=new parent();
		parentObj.print();
		child childObj=new child();
		childObj.print();
	}

	

}


