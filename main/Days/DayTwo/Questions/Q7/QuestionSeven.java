package main.Days.DayTwo.Questions.Q7;
import java.util.Scanner;
import main.Days.DayTwo.Questions.Q7.Interface.*;
class BasicNumberAnalyzer implements questionSevenINF {
    public void analyzeNumbers(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (number == 0) {
                zeroCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}

public class QuestionSeven {
	public void start() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 20 integer numbers:");
        int[] numbers = new int[20];
        
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        questionSevenINF analyzer = new BasicNumberAnalyzer();
        analyzer.analyzeNumbers(numbers);
        scanner.close();
	}

}
