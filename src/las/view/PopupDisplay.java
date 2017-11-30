package las.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Simple GI class using JOptionPane
 * @author bmar8200
 *@version 1.0 03.10.2017
 */
public class PopupDisplay
{
	private ImageIcon icon;
	private String windowTitle;
	
//	public String collectResponse(String)
//	{
//		
//	}
	public PopupDisplay()
	{
		icon = new ImageIcon(getClass().getResource("images/cool_pic.png"));
		windowTitle = "Chatbot says";
	}
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
//	public void displayText(String textToDisplay)
//	{
//		JOptionPane.showMessageDialog(null, textToDisplay);
//	}
//	
//	/**
//	 * Uses a popup to display a question to the user and returns their response as a String.
//	 * @param fromQuestion The question being asked.
//	 * @return The users response to the question.
//	 */
//	public String getResponse(String fromQuestion)
//	{
//		String answer = "";
//		
//		answer += JOptionPane.showInputDialog(null, fromQuestion);
//		
//		return answer;
//	}
}
