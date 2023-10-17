package com.xworkz.september.things;

public class MovieTickets {
	public String movieName;
	public String movieTheaterName;
	public String colourOfTicket;
	public int ticketCost;
	public int seatingNum;
	
    public MovieTickets() {
    	System.out.println("This is the constructor of the class name MovieTickets");
    }
    
    public MovieTickets(String movieName,String movieTheaterName,int ticketCost,int seatingNum) {
    	this.movieName = movieName;
    	this.movieTheaterName = movieTheaterName;
    	this.ticketCost = ticketCost;
    	this.seatingNum = seatingNum;
    	System.out.println("Name of movie:"+this.movieName+"  "+"Theater name:"+this.movieTheaterName+"  "+"Cost of Ticket:"+this.ticketCost+"  "+"Seating number:"+this.seatingNum);
    }
}
