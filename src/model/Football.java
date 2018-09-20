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
	
	
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	public int getTimeSeconds()
	{
		return timeSeconds;
	}
	public int getScoreHome()
	{
		return scoreHome;
	}
	public int getScoreAway()
	{
		return scoreAway;
	}
	public String getTeamName()
	{
		return teamName;
	}
	public String getAgainst()
	{
		return against;
	}
	public int getQuarter()
	{
		return quarter;
	}
	public int getBallPos()
	{
		return ballPos;
	}
	public int getDown()
	{
		return down;
	}
	public int getYardsFirstDown()
	{
		return yardsFirstDown;
	}
	public boolean getHasBall()
	{
		return hasBall;
	}
	public void setTimeMinutes(int min)
	{
		this.timeMinutes = min;
	}
	public void setTimeSeconds(int sec)
	{
		this.timeSeconds = sec;
	}
	public void setScoreHome(int scoreHome)
	{
		this.scoreHome = scoreHome;
	}
	public void setScoreAway(int scoreAway)
	{
		this.scoreAway = scoreAway;
	}
	public void setTeamName(String nameTeam)
	{
		this.teamName = nameTeam;
	}
	public void setAgainst(String against)
	{
		this.against = against;
	}
	public void setQuarter(int quarter)
	{
		this.quarter = quarter;
	}
	public void setBallPos(int ball)
	{
		this.ballPos = ball;
	}
	public void setDown(int down)
	{
		this.down = down;
	}
	public void setYardsFirstDown(int first)
	{
		this.yardsFirstDown = first;
	}
	public void setHasBall(boolean hasBall)
	{
		this.hasBall = hasBall;
	}
	
	
	
	
}
