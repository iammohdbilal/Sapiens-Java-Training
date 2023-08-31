package main.Days;
import java.util.Scanner;

import main.Days.DayOne.DayOne;
import main.Days.DayThree.DayThree;
import main.Days.DayTwo.DayTwo;

public class Days {
	int d;
	public Days(int d){
		this.d=d;
	}
	public void start() {
		System.out.println("Which question do you want");
		Scanner sc=new Scanner(System.in);
		int qno=sc.nextInt();
		switch(d) {
		case 1:
			DayOne myDayOne=new DayOne(qno);
			myDayOne.start();
			break;
		case 2:
			DayTwo myDayTwo=new DayTwo(qno);
			myDayTwo.start();
			break;
		case 3:
			DayThree myDayThree=new DayThree(qno);
			myDayThree.start();
			break;
		default:
			System.out.println("Invalid day choice!");
			break;
				
		}
		sc.close();
		
		
	}

}
