package strings.view;

import javax.swing.JOptionPane;

/**
 * Simple GUI class using JOptionPane.
 * @author Noah Uffens
 *@version 1.0 03.10.2017
 */
public class StringDisplay
{
	
/**
 * displa a popup showwing the supplied String to the user.
 * @param textToDisplay The text to be displayed.
 */
	public void displayText(String textToDisplay)
	
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	/**
	 * uses a popup to display a question to the user and returns their response as a string.
	 * @param fromQuestion the question being asked.
	 * @return the users response to the question.
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}
