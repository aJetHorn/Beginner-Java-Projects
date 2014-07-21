import java.util.Scanner;
public class SmallFactors {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int testNumber = input.nextInt();
        //prompts for user input of number to be tested
        int counter = 0; //sets counter to keep track of how many pairs the testNumber is divisible by
        if (testNumber > 0) {
        System.out.println("Is " + testNumber + " divisible by a single digit prime? ");
        if (testNumber % 2 == 0 || testNumber % 3 == 0 || testNumber % 5 == 0 || testNumber % 7 == 0) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
        String divisible = "Is " + testNumber + " divisble by ";
        System.out.println(divisible + 2 + " and " + 3 + "?");
        if (testNumber % 6 == 0) {
            System.out.println(true);
            counter++; //increases count for pairs that testNumber is evenly divisible by
        }
        else {
            System.out.println(false);
        }
     
        System.out.println(divisible + 2 + " and " + 5 + "?");
        if (testNumber % 10 == 0) {
            System.out.println(true);
            counter++;
        }
        else {
        	System.out.println(false);   
        }
                 
        System.out.println(divisible + 2 + " and " + 7 + "?");
        if (testNumber % 14 == 0) {
            System.out.println(true);
            counter++;
        }
        else {
        	System.out.println(false);
        }
            
        System.out.println(divisible + 3 + " and " + 5 + "?");
        if (testNumber % 15 == 0) {
            System.out.println(true);
            counter++;
        }
        else {
        	System.out.println(false);
        }           
                
        System.out.println(divisible + 3 + " and " + 7 + "?");
        if (testNumber % 21 == 0) {
            System.out.println(true);
            counter++;
        }
        else {
        	System.out.println(false);
        }

        System.out.println(divisible + 5 + " and " + 7 + "?");
        if (testNumber % 35 == 0) {
            System.out.println(true);
            counter++;
        }
        else {
        	System.out.println(false);
        }      
                
        System.out.println(testNumber + " is divisible by " + counter + " set(s) of numbers"); //number of pairs
        }
        else{
        	System.out.println("Invalid Input"); 
        	//displays "invalid input" if number is less than or equal to zero
        }       
    }
}
