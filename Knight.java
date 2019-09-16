//Joshua Molina
public class Knight implements Observer{
	//Private Subject variable used hold this instance
	private Subject watchman;
	
	//Creates a Knight object using a sent-in Subject value
	public Knight(Subject watchm)
	{
		//Sets watchman to watchm and then registers watchman as an observer
		watchman = watchm;
		watchman.registerObserver(this);
	}
	//Method used to update the status warning status of the class
	public void update(int warning)
	{
		//If-else if statement that checks to see if warning is set to 1 or 2, printing out the correct statement based on the warning
		if (warning == 1)
		{
			System.out.println("Knight: Helps everyone get home safe");
		}
		else if (warning == 2)
		{
			System.out.println("Knight: Prepares for battle");
		}
	}
}
