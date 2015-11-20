
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
	
	
	
	
	public Dice(int dices)//constructor with parameter to determine numbers rolled
	{
		this.dices= dices;
		if(dices <=0)
		{
			throw new IllegalArgumentException("Pick a number 0<x");//validate
		}
		for(int i=0; i<dices;i++)
		{
		ok+=this.roll();
		
		}
		
	
	}
	
	public int getDice()
	{
	return ok;	
	}
	
	
	public String FindRange()
	{
		if(ok<=(3*dices))//determines the range 
		{

			return word="L";// word="LOW range Number!
		}
		
			else 
				return word="H";// word="HIGH range Number!
			
		}
	
	/*public String getRange()
	{
		return word;
	} 
	*/
		
	}
	
	
	
	


