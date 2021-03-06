package las.controller;

import java.util.List;
import java.util.ArrayList;
import las.model.Kahoot;
import las.view.PopupDisplay;
import las.model.Chatbot;

public class ListController
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	private Chatbot chatbot;
	
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
		chatbot = new Chatbot("Branton Martinson");
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
		changeTheList();
		
//		String response = popup.collectResponse("What do you want to talk about?");
//		
//		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response));
//		{
//			response = popupChat(response);
//			response = popup.collectResponse(response);
//		}
	}
	
	public String popupChat(String chat)
	{
		String chatbotSays = "";
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
				
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
			
			String topic = currentKahoot.getTopic();
			
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
			}
		
		}
	}
	
	private void fillTheList()

	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The Fifty Nifty United States.");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "Doubles");
		Kahoot animalColor = new Kahoot("Branton", 10,"All the colors of the animals");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		Kahoot reasonsToLive = new Kahoot("Sebastion", 0, "Are there reasons to live?");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(animalColor);
		myKahoots.add(bigQuiz);
		myKahoots.add(presidents);
		myKahoots.add(reasonsToLive);
	}
	
	private void changeTheList()



	{
		popup.displayText("The curent list size : " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The List now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still : " + myKahoots.size() + " items big.");
		removed = myKahoots.set(2,  new Kahoot());
		popup.displayText("The Kahoot by " + removed.getCreator() + " was replaced with on by: " + myKahoots.get(2).getCreator());
	}
	
	public PopupDisplay getPopup()
	{
		
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
	
	
	public int findMaxLength(ArrayList<String> myList)
	{
		int max = 0;
		for (int index = 0; index < myList.size(); index++)
		{
			if (myList.get(index).length() > max)
			{
				max = myList.get(index).length();
			}
		}
		
		return max;
	}
}
