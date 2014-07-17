
public class Arithmetic {
	public static void main(String args[]){
		int numberOfFriends = 5;
	    double buffetPricePerDinner = 15.99;
	    double totalPrice = numberOfFriends * buffetPricePerDinner;
	    
	    
	    int result = (int)(1 + totalPrice / 20);
	    double change = (result * 20) - totalPrice;
	    System.out.println("I have " + numberOfFriends + " Friends");
	    System.out.println("The price per dinner is " + buffetPricePerDinner);
	    System.out.println("The total price is: " + totalPrice);
	    System.out.println("I will need " + result + " 20 dollar bills to pay for dinner");
	    System.out.println("I will receive " + change + " in change");
	}
}
