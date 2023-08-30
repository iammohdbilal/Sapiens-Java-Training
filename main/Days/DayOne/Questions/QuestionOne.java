package main.Days.DayOne.Questions;

import java.util.Scanner;

public class QuestionOne {
	private int[] array;
	
	
	public void takeInput() {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		array=new int[length];
		for(int i=0;i<length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(findDigit(array));
		sc.close();
	}
	
	public String findDigit(int[] array) {
		for(int num:array) {
			if(num==9) {
				return "Bingo!";
			}
		}
		return "9 is not present in the array";
	}
}
