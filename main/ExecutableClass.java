package main;
import java.util.Scanner;
import main.Days.*;

public class ExecutableClass {
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day you want");
		int day=sc.nextInt();
		Days days=new Days(day);
		days.start();
		sc.close();
		
	}

}
