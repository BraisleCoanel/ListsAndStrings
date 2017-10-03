package las.controller;

import java.util.List;
import java.util.ArrayList;
import las.model.Kahoot;
import las.view.PopupDisplay;

public class ListController
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	private void showTheList()
	{
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
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
