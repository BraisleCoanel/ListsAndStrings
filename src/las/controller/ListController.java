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
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for(int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("Wow nobody does a lot!");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
		
		}
	}
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The Fifty Nify United States.");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "Doubles");
		Kahoot animalColor = new Kahoot("Branton", 10,"All the colors of the animals");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(animalColor);
		myKahoots.add(bigQuiz);
		myKahoots.add(presidents);
	}

}
