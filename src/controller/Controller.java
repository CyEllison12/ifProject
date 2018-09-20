package controller;
import model.Football;
import javax.swing.JOptionPane;

public class Controller
{
	private Football userTeam;
	public Controller()
	{
		userTeam = new Football();
	}
	public void start()
	{
		JOptionPane.showMessageDialog(null, "You will enter in all the info for your team during a game!");
		JOptionPane.showMessageDialog(null, "All your info will be shown at the end!");
		JOptionPane.showMessageDialog(null, "Please enter in the right variables! If you don't it wont work!");
		
		String userInput = JOptionPane.showInputDialog("What is your teams name?");
		userTeam.setTeamName(userInput);
		
		userInput = JOptionPane.showInputDialog("What quarter is it?");
		int quarter = 0;
		if(validInt(userInput))
		{
			quarter = Integer.parseInt(userInput);
		}
		if(quarter >= 5)
		{
			quarter = 4;
		}
		else if(quarter <= 0)
		{
			quarter = 1;
		}

		userTeam.setQuarter(quarter);
		
	}
	public boolean validInt(String maybeInt)
	{
		
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}
}
