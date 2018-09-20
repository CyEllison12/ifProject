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
	
	/**
	 * Default constructor for a Football game.
	 * Initializes all value to valid but "bad" values
	 * Used for later customization
	 */
	public Football()
	{
		this.timeMinutes = -99;
		this.timeSeconds = -99;
		this.scoreHome = -99;
		this.scoreAway = -99;
		this.teamName = "No team";
		this.against = "Not playing against anyone!";
		this.quarter = -99;
		this.ballPos = -99;
		this.down = -99;
		this.yardsFirstDown = -99;
		this.hasBall = false;
	}
	/**
	 * Initializes a Football team name.
	 * @param name The team name.
	 */
	public Football(String name)
	{
		this.teamName = name;
	}
	
	

}
