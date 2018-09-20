package model;

public class Football
{
	//-------------Declaration Section------------------------
	private int timeMinutes;
	private int timeSeconds;
	private int scoreHome;
	private int scoreAway;
	private String teamName;
	private String against;
	private int quarter;
	private int ballPos;
	private int down;
	private int yardsFirstDown;
	private boolean hasBall;
	//--------------------------------------------------------
	
	
	public Football()
	{
		//default constructor
	}
	public Football(String name)
	{
		this.teamName = name;
	}
	
	

}
