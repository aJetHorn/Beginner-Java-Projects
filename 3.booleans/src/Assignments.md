Program #1. Write a program that prompts the user to enter an integer for the user’s birth month (January is 1, December is 12) and print out with which famous computer scientist the user shares a birth month. Here is a list of famous computer scientists:
•	Douglas Engelbart – January 
•	Steve Jobs – February 
•	Richard Stallman – March 
•	Claude Shannon – April 
•	James Gosling – May 
•	Alan Turing – June 
•	Marc Andreessen – July 
•	Sergey Brin – August 
•	Dennis Ritchie – September 
•	Bill Gates – October 
•	George Boole – November 
•	Grace Hopper – December  Save your program as BirthMonth.java. You should also make certain the user provides a valid number for a month. Here are two example runs:  What month were you born? 12 You were born the same month as Grace Hopper!  What month were you born? 13
•	That is not a valid month.
•	
 
Program #2. This problem is an extension of #3.5. Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week. Make sure that the user provides an integer in the required range for both inputs, and show an error message if that is not the case. Save your program as DayOfWeek.java.
Program #3. This is #3.9. An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
(d1 x1+d2 x2+d3 x3+d4 x4+d5 x5+d6 x6+d7 x7+d8 x8+d9 x9)%11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer. Save your program as ISBN.java. Here are two sample runs:
Enter the first 9 digits of an ISBN as integer: 013601267 The ISBN-10 number is 0136012671
Enter the first 9 digits of an ISBN as integer: 013031997 The ISBN-10 number is 013031997X
Program #4. This is #3.19. Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge. Save your program as Perimeter.java.
Program #5. This is a variation of #3.26. Write a program that prompts the user to enter an integer and determines whether it is a factor of (i.e., evenly divisible by) any single digit prime number (e.g., 2, 3, 5, or 7), and prints a statement saying so. Determine also whether it is divisible by each combination of two of those primes and print a statement to that effect. Finally, print a count of how many sets of primes were divisible. Save your program as SmallFactors.java. Here are two example runs:
Enter an integer: 13 Is 13 divisible by a single digit prime? false
Is 13 divisible by 2 and 3?  false
Is 13 divisible by 2 and 5?  false
Is 13 divisible by 2 and 7?  false
Is 13 divisible by 3 and 5?  false
Is 13 divisible by 3 and 7?  false
Is 13 divisible by 5 and 7?  false
13 is divisible by 0 set(s) of single digit prime pairs.
Enter an integer: 30 Is 30 divisible by a single digit prime? true Is 30 divisible by 2 and 3? true Is 30 divisible by 2 and 5? true Is 30 divisible by 2 and 7? false Is 30 divisible by 3 and 5? true Is 30 divisible by 3 and 7? false Is 30 divisible by 5 and 7? false 30 is divisible by 3 set(s) of single digit prime pairs.
Program #6. This is #3.31. Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. Save your program as ConvertCurrency.java. Here are sample runs.
Enter the exchange rate from dollars to RMB: 6.81 Enter 0 to convert dollars to RMB and 1 vice versa: 0 Enter the dollar amount: 100 $100.0 is 681.0 yuan
Enter the exchange rate from dollars to RMB: 6.81 Enter 0 to convert dollars to RMB and 1 vice versa: 1 Enter the RMB amount: 10000 10000.0 yuan is $1468.43
Enter the exchange rate from dollars to RMB: 6.81 Enter 0 to convert dollars to RMB and 1 vice versa: 5 Incorrect input
