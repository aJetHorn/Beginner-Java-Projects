
public class Calculate {
	public static void main(String args[]){
	    double myDinnerCost = 14.95;
	    double yourDinnerCost = 12.95;
	    
	    double ourTipPercentage = .17;
	    double ourPreTipTotal = myDinnerCost + yourDinnerCost;
	    double ourPostTipTotal = ourPreTipTotal + (ourPreTipTotal * ourTipPercentage);
	    
	    System.out.println("My dinner costs " + myDinnerCost + " Dollars");
	    System.out.println("Your dinner costs " + yourDinnerCost + " Dollars");
	    System.out.println("Our pre-Tip total is: " + ourPreTipTotal + " Dollars");
	    System.out.println("Our post-Tip total is: " + ourPostTipTotal + " Dollars");
	  
	}
}
