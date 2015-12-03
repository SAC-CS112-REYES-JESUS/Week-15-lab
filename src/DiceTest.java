import java.util.Scanner;

import java.lang.*;

public class DiceTest {

	public static void main(String[] args){
		
		int playtime=0;//variable to keep times of played
		
		int Scorre=0;
		int[] Array=new int[10];
		int j=0;
		
	System.out.println("Welcome to the DICE GAME!!!");
		
	Scanner input= new Scanner(System.in);
	
		
		
		int quit=0;//player decides when to quit
		
		while(quit ==0)
	{
			
			boolean countingLoop = true;
		do{
			try{
		System.out.println("Okay select the number of dice to roll");
		int dicenNumber=input.nextInt();
			countingLoop = false;
		Dice DiceGame= new Dice(dicenNumber);//Q2 DiceGame is the new object that is being instantiated form Dice class
		
		
		System.out.printf("DBG--DICE:: %d\n",DiceGame.getDice());//Q5 (debug)
		//ranges are outputed
		
		Array[j]=DiceGame.getDice();
		j++;//keeping track of computer generated dice(number)
		
		
		System.out.printf("Okay go ahead and guess the range of the number Low (%d -%d)\n",dicenNumber,dicenNumber *3);
		System.out.printf("or High is (%d -%d)\n..",dicenNumber*3+1,dicenNumber *6);
		System.out.println("Low for LOW RAnge or High for High RAnge???");
		
		
		char range = input.next().charAt(0); //players takes a guess and ONLY FIRST LETTER TAKEN
		char upper = Character.toUpperCase(range);//Q5 records score.

		System.out.printf("DBG--The the letter/answer you have CHOOSEN : %s\n", upper);  //(debug)
		
		String wordAn=DiceGame.FindRange();//method to figure out range from class
		System.out.printf("DBG--The correct range is:%s\n",wordAn);//(debug)
		
		
		//debug
		if((upper == 'L')||(upper=='H'))
		{
			if(wordAn.equals(String.valueOf(upper)))//match range and guess
			{
				System.out.println("Correct you guess the correct range");	
				Scorre++;
			}
			else		
			{
				System.out.println("Sorry buddy, wrong choice");
				Scorre--;
			}
		
		
		
		playtime++;//Q3 keep track of times played
		}
		
		else{
		System.out.println("INVALID answers MUSt pick LOW or High");
		}
	//

		System.out.println("To Continue to play press 0 or 1 to quit");
		quit=input.nextInt();
			}
		
		catch(Exception error)
		{
			System.out.printf("Sorry not valid number needs to #:%s\n",error);
			input.nextLine();
			
		}
		}while(countingLoop);

	}
		
	
		System.out.printf("\nthe total numbers of time played was %d", playtime);//number of times played
		System.out.printf("\nthe total points collected: %d", Scorre);//Q4number points won
	
	for(int i=0;i<Array.length;i++)
		{
			System.out.printf("\nThe number for game  %d was: %d",i+1 , Array[i]);
		}
		//array for number randomized
	
}
	

	
}

//
