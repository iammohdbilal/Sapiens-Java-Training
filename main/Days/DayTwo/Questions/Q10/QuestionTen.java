package main.Days.DayTwo.Questions.Q10;
import java.io.*;
import main.Days.DayTwo.Questions.Q10.Interface.*;


class BasicFileIO implements questionTenINF {
    public void writeToFile(String content, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        reader.close();
        return content.toString();
    }
}
public class QuestionTen {
	public void start() {
		 String content = "The Quick Brown Fox Jumps Over a Lazy Dog.";
	        String filename = "textfile.txt";

	        questionTenINF fileIO = new BasicFileIO();

	        try {
	            fileIO.writeToFile(content, filename);
	            System.out.println("File written successfully.");

	            String readContent = fileIO.readFromFile(filename);
	            System.out.println("Read from file: \n" + readContent);
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


