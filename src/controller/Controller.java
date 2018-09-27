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
		boolean isFinished = true;
		JOptionPane.showMessageDialog(null, "You will enter in all the info for your team during a game!"
				+ "\nAll your info will be shown at the end!"
				+ "\nPlease enter in the right variables! If you don't it wont work!");
		
		
		while(isFinished == true)
		{
		String userInput = JOptionPane.showInputDialog("What is your teams name?");
		userTeam.setTeamName(userInput);
		
		userInput = JOptionPane.showInputDialog("What team are you playing against?");
		userTeam.setAgainst(userInput);
		
		userInput = JOptionPane.showInputDialog("What quarter is it?");

		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "What quarter is it? (NUMBER)");	
		}
		if(userTeam.getQuarter() > 4)
		{
			userTeam.setQuarter(4);
		}


		userTeam.setQuarter(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog("How many minutes are left?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "How many minutes are left? (NUMBER)");	
		}
		userTeam.setTimeMinutes(Integer.parseInt(userInput));
		if(userTeam.getTimeMinutes() >= 12)
		{
			userTeam.setTimeMinutes(12);
		}
		
		userInput = JOptionPane.showInputDialog("How many seconds are left?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "How many seconds are left? (NUMBER)");	
		}
		userTeam.setTimeSeconds(Integer.parseInt(userInput));
		if (userTeam.getTimeSeconds() >= 60)
		{
			userTeam.setTimeSeconds(00);
		}
		else if (userTeam.getTimeSeconds() == 0)
		{
			userTeam.setTimeSeconds(00);
		}
		
		userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getTeamName() +  " score?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getTeamName() +  " score? (NUMBER)");	
		}
		userTeam.setScoreHome(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getAgainst() + " teams score?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getAgainst() +  " teams score? (NUMBER)");	
		}
		userTeam.setScoreAway(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog(null, "What yardline is the ball on? (use negative numbers for own side of field)");
		while(!validInt(userInput))
		{
			userInput= JOptionPane.showInputDialog(null, "What yard line is the ball on? WHOLE NUMBERS");
		}
		userTeam.setBallPos(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog(null, "What down is it? (1-4)");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "WHAT DOWN IS IT? (WHOLE NUMBER)");
		}
		userTeam.setDown(Integer.parseInt(userInput));
		if(userTeam.getDown() >= 4)
		{
			userTeam.setDown(4);
		}
		
		userInput = JOptionPane.showInputDialog(null, "How many yards to the first down?");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "HOW MANY YARDS TO THE FIRST DOWN? (WHOLE NUMBER)");
		}
		userTeam.setYardsFirstDown(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog(null, "Does your team have the ball? (True/False)");
		while(!validBool(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "Does your team have the ball (TRUE/FALSE)");
		}
		userTeam.setHasBall(Boolean.parseBoolean(userInput));
		
		JOptionPane.showMessageDialog(null, userTeam.getTeamName() + " vs " + userTeam.getAgainst()
											+ "\nScores: " + userTeam.getScoreHome() + " vs " + userTeam.getScoreAway()
											+ "\nTime: " + userTeam.getTimeMinutes() + ":" + userTeam.getTimeSeconds()
											+ "\nQuarter: " + userTeam.getQuarter()
											+ "\nBall Position: " + userTeam.getBallPos() + " yard line" 
											+ "\nDown: " + userTeam.getDown()
											+ "\nYards to first down: " + userTeam.getYardsFirstDown()
											+ "\nDoes " + userTeam.getTeamName() + " have the ball: " + userTeam.getHasBall());
		
		

		userInput = JOptionPane.showInputDialog(null, "Would you like to try again? (True/False)\n(Anything other then True will result in false)");
		while(!validBool(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "Would you like to try again? (True/False)\n(Anything other then True will result in false)");
		}
		isFinished = validBool(userInput);
		if(isFinished == true)
		{
			isFinished = false;
		}
		else
		{
			isFinished = true;
		}
		}
		
		

		
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
		//	JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}

	public boolean validBool(String maybeInt)

{
	
	boolean isValid = false;
	
	try
	{
		Boolean.parseBoolean(maybeInt);
		isValid = true;
	}
	catch (NumberFormatException error)
	{
	//	JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
	}
	return isValid;
}


	public String toString()
	{
		String description = "";
		description += "";
		return description;
	}







}
