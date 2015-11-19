import java.util.Scanner;


public class DiceTest {

	public static void main(String[] args){
		
		int playtime=0;//variable to keep times of played
		
	System.out.println("Welcome to the DICE GAME!!!");
		
	Scanner input= new Scanner(System.in);
	
		
		
		int quit=0;
		
		while(quit ==0){
			
		
		
		System.out.println("Okay select the number of dice to roll");
		int dicenNumber=input.nextInt();
		
		Dice DiceGame= new Dice(dicenNumber);//q2 DiceGame is the new object that is being instantiated form Dice class
		
		System.out.println(DiceGame.getDice());
		
		System.out.printf("Okay go ahead and guess the range of the number Low %d -%d\n",dicenNumber,dicenNumber *3);
		System.out.printf("or High %d -%d\n..",dicenNumber*3+1,dicenNumber *6);
		System.out.println("1 for LOW RAnge or 2 for High RAnge???");
		
		
		int range = input.nextInt(); 
	
		DiceGame.FindRange();
		
		
		System.out.println(DiceGame.getWord());
		
	
	
		
		playtime++;
		
		System.out.println("To play press 0 or 1 to quit");
		quit=input.nextInt();
		
		

	}
		System.out.printf("\nthe total numbers of time played was %d", playtime);
		System.out.printf("\nthe total points collected", playtime);
	
	
	
	}
	

	
}
