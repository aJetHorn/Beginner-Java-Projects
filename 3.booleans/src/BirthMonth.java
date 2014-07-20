import java.util.Scanner;
public class BirthMonth {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        System.out.println("What (numeric) month were you born in? ");
        int month = input.nextInt();
        
        if (month <= 12 && month > 0) // checks that the value is between 1 and 12
        {
            System.out.print("You were born in the same month as ");
            switch (month) //the case values below correspond to months beginning with January
            {
                case 1: 
                    System.out.print("Douglas Engelbart");
                    break; 
                case 2: 
                    System.out.print("Steve Jobs");
                    break;
                case 3: 
                    System.out.print("Richard Stallman");
                    break;
                case 4:
                    System.out.print("Claude Shannon");
                    break;
                case 5:
                    System.out.print("James Gosling");
                    break;
                case 6:
                    System.out.print("Alan Turing");
                    break;
                case 7:
                    System.out.print("Marc Andreessen");
                    break;
                case 8:
                    System.out.print("Sergey Brin");
                    break;
                case 9:
                    System.out.print("Dennis Ritchie");
                    break;
                case 10:
                    System.out.print("Bill Gates");
                    break;
                case 11:
                    System.out.print("Geore Boole");
                    break;
                case 12:
                    System.out.print("Grace Hopper");
                    break;
                default:
        }      
    }
    else //if month < 1 or month > 12
        System.out.println("Invalid Month");
	}
}

