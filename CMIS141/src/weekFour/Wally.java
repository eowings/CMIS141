package weekFour;

public class Wally { 
	
	private int tickettype;
	private double totalTickets;
	private double totalDollars;
	
	
	// Constructor
    public Wally (int type,double tt, double td) { 
    	tickettype = type;
    	totalTickets = tt;
    	totalDollars = td;
    }
    
    // Methods
	public void adult () { 
		if (tickettype == 5) {
		totalTickets += 1.00;
		totalDollars += 15.00;
		} else 
			totalTickets += 0.00;
			totalDollars += 0.00;
	    }
	public void kid () { 
		if (tickettype == 1) {
		totalTickets += 1.00;
		totalDollars += 7.50;
		} else 
			totalTickets += 0.00;
			totalDollars += 0.00;
	    }

	// Setter methods
	public void settickets(double tt) {
		totalTickets = tt;
		}
	public void setdollars(double td) {
		totalDollars = td;
		}
	
    // Getter methods
	public double getTickets() {
		return totalTickets;
		}
	public double getDollars() {
		return totalDollars;
		}
	/*
	public void totals () { 
		getTickets
		getDollars
		
		}
		*/

	
	
}