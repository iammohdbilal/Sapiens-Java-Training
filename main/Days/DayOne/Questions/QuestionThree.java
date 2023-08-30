package main.Days.DayOne.Questions;

import java.util.Scanner;

public class QuestionThree {
private char[] letters;
	
	
	
	public char findMissing(char[] letters) {
		for(int i=1;i<letters.length;i++) {
			if(letters[i]-letters[i-1]>1) {
				return (char) (letters[i-1]+1);
			}
		}
		return '\0';
	}
	
	public void takeInput() {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] letterStrings=input.split("\\s+");
		letters=new char[letterStrings.length];
		for(int i=0;i<letterStrings.length;i++) {
			letters[i]=letterStrings[i].charAt(0);
		}
		System.out.println(findMissing(letters));
	}
}
