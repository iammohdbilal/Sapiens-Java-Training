package main.Days.DayTwo.Questions.Q5;

class StringSplitter {
    public static void splitAndPrint(String input) {
        String[] splitArray = input.split(":");

        if (splitArray.length == 2) {
            String part1 = splitArray[0].trim();
            String part2 = splitArray[1].trim();

            System.out.println(part1);
            System.out.println(part2);
        } else {
            System.out.println("Invalid input format.");
        }
    }
}

public class QuestionFive {
	public void start() {
	String inputString = "Quote: The quick brown fox jumps over the lazy dog";

    StringSplitter.splitAndPrint(inputString);
	}

}
