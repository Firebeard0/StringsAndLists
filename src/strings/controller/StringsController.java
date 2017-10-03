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
	}
	
	private void showTheList()
	{
		for (int index = 0 ; index < myKahoots.size(); index ++)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	/*
	 * added a lot of objects to the list
	 */
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("kashish", 50);
		Kahoot mySecondahoot = new Kahoot("Ethan", 2);
		Kahoot isaacStinks = new Kahoot("Issac", 1);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondahoot);
		myKahoots.add(isaacStinks);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
	}
}
