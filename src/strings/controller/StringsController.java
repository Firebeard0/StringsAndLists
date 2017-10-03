package strings.controller;

import java.util.List;
import java.util.ArrayList;
import strings.model.Kahoot;

public class StringsController
{
	private List<Kahoot> myKahoots;
	
	public StringsController()
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
		Kahoot fiftyStates = new Kahoot("kashish", 50);
		Kahoot mySecondahoot =new Kahoot("Ethan", 2);
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
