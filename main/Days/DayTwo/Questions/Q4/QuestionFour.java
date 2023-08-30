package main.Days.DayTwo.Questions.Q4;
import main.Days.DayTwo.Questions.Q4.Interface.*;

abstract class Pen{
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen{
	public void write() {
		System.out.println("Writing with a fountain pen.");
	}
	
	public void refill() {
		System.out.println("Refilling fountain pen.");
	}
	
	void changeNib() {
		System.out.println("Changing fountain pen Nib");
	}
}

class Monkey{
	void jump() {
		System.out.println("Monkey is jumping");
	}
	
	void bite() {
		System.out.println("Monkey is biting");
	}
}

class Human extends Monkey implements questionFourINF{
	public void eat() {
		System.out.println("Human is eating");
	}
	
	public void sleep() {
		System.out.println("Human is sleeping");
	}
}

abstract class Telephone{
	abstract void dial();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone{
	void dial() {
		System.out.println("Dialing on telephone");
	}
	
	void lift() {
		System.out.println("Lifting on telephone");
	}
	
	void disconnect() {
		System.out.println("Disconnecting call on a smart telephone");
	}
}

class TV implements TvRemote {
    public void power() {
        System.out.println("TV power button pressed.");
    }
    
   
    }



public class QuestionFour {
	public void start() {
		 Monkey monkey = new Monkey();
	        Human human = new Human();
	        
	        Monkey someAnimal = new Human();
	        
	        monkey.jump();
	        monkey.bite();
	        
	        human.jump();
	        human.bite();
	        human.eat();
	        human.sleep();
	        
	        someAnimal.jump();
	        someAnimal.bite();
	        TV tv = new TV();
	        tv.power();
	}
	

}
