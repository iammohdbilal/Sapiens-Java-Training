package main.Days.DayTwo.Questions.Q10.Interface;
import java.io.*;
public interface questionTenINF {
	void writeToFile(String content, String filename) throws IOException;
    String readFromFile(String filename) throws IOException;
}
