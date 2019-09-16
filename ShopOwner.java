//Joshua Molina
public class ShopOwner implements Observer{
	//Private Subject variable used hold this instance
	private Subject watchman;
	
	//Creates a ShopOwner object using a sent-in Subject value
	public ShopOwner(Subject watchm)
	{
		//Sets watchman to watchm and then registers watchman as an observer
		this.watchman = watchm;
		watchman.registerObserver(this);
	}
	
	//Method used to update the status warning status of the class
	public void update(int warning)
	{
		//If-else if statement that checks to see if warning is set to 1 or 2, printing out the correct statement based on the warning
		if (warning == 1)
		{
			System.out.println("Shop Owner: Close down shop and head home");
		}
		else if (warning == 2)
		{
			System.out.println("Shop Owner: Drop everything and find nearest hideout");
		}
	}
}