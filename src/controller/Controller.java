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
		int count = 0;
		JOptionPane.showMessageDialog(null, "You will enter in all the info for your team during a game!"
				+ "\nAll your info will be shown at the end!"
				+ "\nPlease enter in the right variables! If you don't it wont work!");
		
		
		while(isFinished == true)
		{
			//asks home team name + saves it
		String userInput = JOptionPane.showInputDialog("What is your teams name?");
		userTeam.setTeamName(userInput);
		
		//asks away teams name + saves it
		userInput = JOptionPane.showInputDialog("What team are you playing against?");
		userTeam.setAgainst(userInput);
		
		//asks quarter + saves it
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
		
		//Asks the amount of minutes left + saves it
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
		
		//Asks how many seconds are left + saves it
		userInput = JOptionPane.showInputDialog("How many seconds are left?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "How many seconds are left? (NUMBER)");	
		}
		userTeam.setTimeSeconds(Integer.parseInt(userInput));
		//Makes sure the info for seconds is correct
		if (userTeam.getTimeSeconds() >= 60)
		{
			userTeam.setTimeSeconds(00);
		}
		else if (userTeam.getTimeSeconds() == 0)
		{
			userTeam.setTimeSeconds(00);
		}
		
		//Asks for home teams score + saves it
		userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getTeamName() +  " score?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getTeamName() +  " score? (NUMBER)");	
		}
		userTeam.setScoreHome(Integer.parseInt(userInput));
		
		//Asks for away teams score + saves it
		userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getAgainst() + " teams score?");
		while(!validInt(userInput))
		{
		 userInput = JOptionPane.showInputDialog(null, "What is " + userTeam.getAgainst() +  " teams score? (NUMBER)");	
		}
		userTeam.setScoreAway(Integer.parseInt(userInput));
		
		//Asks for where the ball is on the field  + saves it
		userInput = JOptionPane.showInputDialog(null, "What yardline is the ball on? (use negative numbers for own side of field)");
		while(!validInt(userInput))
		{
			userInput= JOptionPane.showInputDialog(null, "What yard line is the ball on? WHOLE NUMBERS");
		}
		userTeam.setBallPos(Integer.parseInt(userInput));
		
		//Asks what down it is + saves it
		userInput = JOptionPane.showInputDialog(null, "What down is it? (1-4)");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "WHAT DOWN IS IT? (WHOLE NUMBER)");
		}
		userTeam.setDown(Integer.parseInt(userInput));
		//If downs is greater then 4, sets it to 4
		if(userTeam.getDown() >= 4)
		{
			userTeam.setDown(4);
		}
		
		//Asks for how many yards to the first down + saves it
		userInput = JOptionPane.showInputDialog(null, "How many yards to the first down?");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "HOW MANY YARDS TO THE FIRST DOWN? (WHOLE NUMBER)");
		}
		userTeam.setYardsFirstDown(Integer.parseInt(userInput));
		
		//Asks if your team has the ball (boolean) + saves it
		userInput = JOptionPane.showInputDialog(null, "Does your team have the ball? (True/False)");
		while(!validBool(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "Does your team have the ball (TRUE/FALSE)");
		}
		userTeam.setHasBall(Boolean.parseBoolean(userInput));
		
		//Outputs all the saved data from before
		JOptionPane.showMessageDialog(null, userTeam.getTeamName() + " vs " + userTeam.getAgainst()
											+ "\nScores: " + userTeam.getScoreHome() + " vs " + userTeam.getScoreAway()
											+ "\nTime: " + userTeam.getTimeMinutes() + ":" + userTeam.getTimeSeconds()
											+ "\nQuarter: " + userTeam.getQuarter()
											+ "\nBall Position: " + userTeam.getBallPos() + " yard line" 
											+ "\nDown: " + userTeam.getDown()
											+ "\nYards to first down: " + userTeam.getYardsFirstDown()
											+ "\nDoes " + userTeam.getTeamName() + " have the ball: " + userTeam.getHasBall());
		//count for how many times they repeated
		count++;
		
		//Asks if they want to go again.
		userInput = JOptionPane.showInputDialog(null, "Would you like to try again? (true/false)\n(Anything other then true will result in false)");
		while(!validBool(userInput))
		{
		userInput = JOptionPane.showInputDialog(null, "Would you like to try again? (True/False)\n(Anything other then True will result in false)");
		}
		isFinished = Boolean.parseBoolean(userInput);

		}
		
		//Outputs how many times thay have tried (only after they have finished)
		JOptionPane.showMessageDialog(null, "You entered info " + count + " times.");
		
		
		

		
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
