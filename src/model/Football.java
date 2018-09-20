package model;

public class Football
{
	//-------------Declaration Section------------------------
	private int timeMinutes;
	private int timeSeconds;
	private int score;
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
		
	}
	public Football(String name)
	{
		this.teamName = name;
	}
	
	

}
