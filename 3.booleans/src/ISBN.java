/*Important note:
 * I dislike this problem because it instructs you to work with ints yet the only
 * way to print a leading zero is to use a string (through concatenation, at least)
 * 
 * So, I'll link to my walkthrough implementation, which uses purely ints. this will
 * work with strings but will be more advanced.
 * 
 */
import java.util.Scanner;
public class ISBN {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 9 digit ISBN:");
		String inputISBN = input.next();
		
		String oISBN = inputISBN;
		int checksum = 0;
		if (inputISBN.length() == 9 &&
				Integer.parseInt(inputISBN) <= 1000000000){
			for (int digitNumber = 1; digitNumber < 10; digitNumber++){
				System.out.println("digitNumber: " + digitNumber);
				int digit = Integer.parseInt(""+inputISBN.charAt(0));
				checksum += digit * digitNumber;
				inputISBN = inputISBN.substring(1,inputISBN.length());
			}
			checksum %= 11;
			if (checksum == 10){
				System.out.println("ISBN is: " + oISBN + "X");
			}
			else{
				System.out.println("ISBN is: " + oISBN + checksum);
			}
		}
		else {
			System.out.println("You didn't enter a nine digit integer");
		}
	}
}
