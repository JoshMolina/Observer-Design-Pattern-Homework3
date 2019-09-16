//Joshua Molina
import java.util.ArrayList;

public class Watchman implements Subject{
	//ArrayList of Observer type used to hold all observers in the town
	ArrayList<Observer> observers;
	//Int value used to hold the warning status of the town
	int warnstat = 0;
	
	//Creates a Watchman object
	public Watchman()
	{
		//Sets observers to a new ArrayList of type Observer
		observers = new ArrayList<Observer>();
	}
	
	//Method used to register observers to the town using a sent-in Observer object
	public void registerObserver(Observer anObs)
	{
		//Adds anObs to the observers array list
		observers.add(anObs);
	}
	
	//Method used to remove an observer from the array list
	public void removeObserver(Observer anObs)
	{
		//Removes anObs from the observers array list
		observers.remove(anObs);
	}
	
	//Method used to go through all observers in the town and notify them
	public void notifyObservers()
	{
		//For each loop that goes through all observers in the observer array list and updates their warning status
		for (Observer observer : observers)
			observer.update(warnstat);
	}
	
	//Method used to issue a warning to the observers of the town with a sent-in warning status as an integer
	public void issueWarning(int warning)
	{
		//Sets the current warning status to the sent-in value
		warnstat = warning;
		if (warnstat == 1)
		{
			System.out.println("WARNING:   1 trumpet was played!");
		}
		else if (warnstat == 2)
		{
			System.out.println("WARNING:   2 trumpets were played!");
		}
		//Calls notifyObservers
		notifyObservers();
	}
}
