package strings.controller;

import java.util.List;
import java.util.ArrayList;
import strings.model.Kahoot;
import strings.view.StringDisplay;
public class StringsController
{
	private List<Kahoot> myKahoots;
	private StringDisplay popup;
	public StringsController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new StringDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
		changeTheList();
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0 ; index < myKahoots.size(); index ++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
		    Kahoot currentKahoot =  myKahoots.get(index);
		    String creator = currentKahoot.getCreator();
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0;loop < 5; loop +=1)
				{
					popup.displayText("wow, nobody does a lot");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex ++)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			
			String topic = currentKahoot.getTopic();
			for (int letter = currentKahoot.getTopic().length() - 1 ; letter >= 0;letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
			}
		}
	}
	/*
	 * added a lot of objects to the list
	 */
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("kashish", 50, "the fifty united states");
		Kahoot mySecondahoot = new Kahoot("Ethan", 2, "double");
		Kahoot isaacStinks = new Kahoot("Issac", 1, "everything");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "fersome");
		Kahoot animalColor = new Kahoot("Branton", 10, "bleh bleh bleh");
		Kahoot noahSucks = new Kahoot("noah", 23423, "rage Intensified");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondahoot);
		myKahoots.add(isaacStinks);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(noahSucks);
	}
	private void changeTheList()
	{
		popup.displayText("the current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed t kahoot by " + removed.getCreator());
		popup.displayText("The list now has : " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("the list is still : " + myKahoots.size() + " items big.");
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("the  kahoot by " + removed.getCreator() + " was replaced by: " + myKahoots.get(2).getCreator());
		removed = myKahoots.set(4, new Kahoot());
		popup.displayText("lists Suck!! " + removed.getCreator()  + " is now gone and is now" + myKahoots.get(4).getCreator());
		
//		 for (int i = 5; i < 10;)
//		 {
//			 popup.displayText("WRECKED!!!!!!!!!");
//		 }
	}
	public StringDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}
