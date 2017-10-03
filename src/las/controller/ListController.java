package las.controller;

import java.util.List;
import java.util.ArrayList;
import las.model.Kahoot;

public class ListController
{
	private List<Kahoot> myKahoots;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethatn", 2);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot presidents = new Kahoot("Obama", 44);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(animalColor);
		myKahoots.add(bigQuiz);
		myKahoots.add(presidents);
	}

}
