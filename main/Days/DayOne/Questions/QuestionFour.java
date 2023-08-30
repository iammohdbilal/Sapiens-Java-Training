package main.Days.DayOne.Questions;

import java.util.Scanner;

public class QuestionFour {
	private String inputLetters;
	private String targetWord;
	
	
	
	public boolean canFormWord(String inputLetters,String targetWord) {
		String combinedLetters=inputLetters+targetWord;
		for(char letter:targetWord.toCharArray()) {
			if(combinedLetters.indexOf(letter)==-1) {
				return false;
			}
		}
		return true;
	}
	
	public void takeInput() {
		Scanner sc3=new Scanner(System.in);
		inputLetters=sc3.nextLine();
		targetWord=sc3.nextLine();
		canFormWord(inputLetters, targetWord);
		checkWord(inputLetters,targetWord);
	}
	
	public void checkWord(String inputLetters,String targetWord) {
		boolean canFormWord=canFormWord(inputLetters, targetWord);
		
		if(canFormWord) {
		 System.out.println("true");
		}else {
		System.out.println("false");
		}
	}
}
