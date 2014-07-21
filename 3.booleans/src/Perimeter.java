import java.util.Scanner;
public class Perimeter {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);        
        System.out.print("Enter First Edge Length: ");
        int firstEdge = input.nextInt();
        if (firstEdge > 0) 
        {
            System.out.print("Enter Second Edge Length: ");
            int secondEdge = input.nextInt();
            if (secondEdge > 0) 
            {
                System.out.print("Enter Third Edge: ");
                int thirdEdge = input.nextInt();
                if (thirdEdge > 0 && thirdEdge < (secondEdge + firstEdge) 
                		&& firstEdge < (secondEdge + thirdEdge) 
                		&& secondEdge < (firstEdge + thirdEdge))
                {
                    int perimeter = firstEdge + secondEdge + thirdEdge; 
                    System.out.println("Perimeter is: " + perimeter); 
                }
                else
                    System.out.println("Invalid Input");
            }
            else 
                System.out.println("Invalid Input - second edge is too small");
        }
        else 
            System.out.println("Invalid Input - first edge is too small");
    }
}

