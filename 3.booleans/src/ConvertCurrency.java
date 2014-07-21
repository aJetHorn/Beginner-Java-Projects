import java.util.Scanner;
public class ConvertCurrency {
	public static void main(String args[]) {
		
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exchange rate from dollars to RMB ");
        double exchangeRate = input.nextDouble();
        //sets the exchange rate from user input
        if (exchangeRate > 0) {
        	System.out.println("Enter 0 for dollars to RMB, 1 for RMB to dollars");
        	int exchangeType = input.nextInt();  
        	//prompts user to choose which way currency will be converted
        	if (exchangeType == 0 || exchangeType == 1) {
        			double dollarAmount = 0;
        			double yuanAmount = 0;
       
        			if (exchangeType == 0) {
        					System.out.println("Enter Dollar Amount ");
        					dollarAmount = input.nextDouble();
        					yuanAmount = dollarAmount * exchangeRate; 
        			}
        			else {
        				System.out.println("Enter Yuan Amount ");
        				yuanAmount = input.nextDouble();
        				dollarAmount = yuanAmount / exchangeRate; 
        			}
        			dollarAmount = (int)(dollarAmount) + ((int)((dollarAmount % 1)*100))*.01;
        			yuanAmount = (int)(yuanAmount) + ((int)((yuanAmount % 1)*100))*.01;   
        			System.out.println("Dollar amount is " + dollarAmount);
        			System.out.println("RMB amount is " + yuanAmount);
        	}
        	else {
        		System.out.println("Invalid Input - Exchange type");
        	}
        }
        else {
        	System.out.println("Invalid Input - Exchange rate");
        }    
    }
}
