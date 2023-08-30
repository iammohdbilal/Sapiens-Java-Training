package main.Days.DayOne.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class QuestionTwo {
	private String input;
	
	
	public void takeInput() {
		Scanner sc1=new Scanner(System.in);
		input=sc1.nextLine();
		System.out.println(sortWords(input));
	}
	
	public String sortWords(String input) {
		String[] words=input.split("\\s+");
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String word1, String word2) {
				if(word1.length()!=word2.length()) {
					return Integer.compare(word1.length(),word2.length());
				}else {
					return word1.compareTo(word2);
				}
			}
		});
		
		return String.join(" ", words);
	}
}
