package tools.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import strings.controller.StringsController;
import strings.view.StringDisplay;
import strings.model.Kahoot;

public class ControllerTest
{
	private StringsController tested;

	@Before
	public void setUp() throws Exception
	{
		tested = new StringsController();
	}

	@After
	public void tearDown() throws Exception
	{
		tested = null;
	}

	@Test
	public void testController()
	{
		assertNotNull("Popup not initialized.", tested.getPopup());
		assertNotNull("ArrayList of Kahoot not initialized", tested.getMyKahoots());
	}

	@Test
	public void testStart()
	{
		tested.start();
		assertTrue("ArrayList of Kahoot is too short", tested.getMyKahoots().size() > 3);
	}

	@Test
	public void testGetPopup()
	{
		assertTrue("Popup type is incorrect", tested.getPopup() instanceof StringDisplay);
	}

	@Test
	public void testGetMyKahoots()
	{
		assertTrue("ArrayList<Kahoot> expected", tested.getMyKahoots() instanceof ArrayList<?>);

	}

}