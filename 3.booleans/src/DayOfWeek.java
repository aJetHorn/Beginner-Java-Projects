import java.util.Scanner;
public class DayOfWeek {
	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        //user input, 0 = Sunday, 1 = Monday)
        System.out.print("Enter the (0 to 6) day of the week: ");
        int dayOfWeek = input.nextInt();
        
        if (dayOfWeek < 7 && dayOfWeek >= 0) //ensures value is within specified range
        {
            System.out.print("The day of the week is ");
            switch (dayOfWeek)
            {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
            }
            
            System.out.println("\nHow many days in the future? (at least 1)");
            int numOfDays = input.nextInt(); //input for how many days into the future
            if (numOfDays > 0)
                {              
                    int result =  (dayOfWeek + numOfDays) % 7; 
                    System.out.print("New day of the week is ");
                    switch (result) 
                    {
                    	case 0:
                    			System.out.println("Sunday");
                    			break;
                    	case 1:
                    			System.out.println("Monday");
                    			break;
                    	case 2:
                    			System.out.println("Tuesday");
                    			break;
                    	case 3:
                    			System.out.println("Wednesday");
                    			break;
                    	case 4:
                    			System.out.println("Thursday");
                    			break;
                    	case 5:
                    			System.out.println("Friday");
                    			break;
                    	case 6:
                    			System.out.println("Saturday");
                    			break;
                    	default:
                    }
                }
                else{
                	System.out.println("Invalid Input");
                }
        }
        else{
        	System.out.println("Invalid Input");    
        } 
    }
}
