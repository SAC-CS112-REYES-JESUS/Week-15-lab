
public class Dice {

	
	private int dices;
	private int randomNumber;
	private int ok;
	private String word;
	
	public int roll()
	//basic roll method one dice
	
	{
		int random = (int) (Math.random()*6+1);
		randomNumber=random;
		return randomNumber;
	}
	
	
	public Dice()//default contructor
	{
		this.roll();
		
	}
	
	
	
	public Dice(int dices)
	{
		this.dices= dices;
		for(int i=0; i<dices;i++)
		{
		ok+=this.roll();
		
		}
	
	}
	
	public int getDice()
	{
	return ok;	
	}
	
	
	public void FindRange()
	{
		if(ok>=4 && ok<=6){
			
			
			word="Number falls between 1-3";}
		
		else if(ok>=3 && ok<=9 )
				
			word="Number is between 3-6";
			
			
		}
	
	public String getWord()
	{
		return word;
	}
		
	}
	
	
	
	


