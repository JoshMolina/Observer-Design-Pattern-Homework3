//Joshua Molina
public interface Subject {
	//Methods used to add and remove observers based on the observer objects sent in
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	//Method that will be used to notify the observers of the town
	public void notifyObservers();
}
