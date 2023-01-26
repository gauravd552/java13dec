package Encapsul;

public class Movie {
	
	private String movieName;
	private String movieCategory;
	private int ticketCost;
	
	//setter for Movie name
	
	public void setMovieName (String movieName)
	{
		this.movieName=movieName;
	}
	
	//getter for movie name
	
	
	String getMovieName()
	{
		return movieName;
	}
	
	//setter for movie category
	
	public void  setMovieCategory(String movieCategory)
	{
		this.movieCategory=movieCategory;
		
	}
	
	//getter for movie category
	
	
	public String getMovieCategory()
	{
		return movieCategory;
	}
	
	//setter for ticket cost
	
	public void setTicketCost(int ticketCost)
	{
		this.ticketCost= ticketCost;
	}
	
	//getter for ticket cost
	
	
	public int getTickstCost()
	{
		return ticketCost;
	}
	
	int calculateTicketCost(String circle)
	{
		if(circle.equals("Gold")  && movieCategory.equals("2D") )
			return 300;
		
		else if(circle.equals("Gold")  && movieCategory.equals("3D"))
			return 500;
		
		else if(circle.equals("Silver")  && movieCategory.equals("3D"))
			return 450;
		else
			return 0;
	}
	}


