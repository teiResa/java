/*   SoloLearn.
Written: 2021-05-22

You need a program to convert days into seconds.
The code before the // is given. It takes the amount of days as input.
Complete the code to convert it to seconds and output the result.

Remember:
12 days are 12*24 = 288 hours, which are 228*60 = 17280, which are 17280*60 = 1036800 seconds.
*/

import java.vtil.Scanner;

public class Program {
  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    int days = scanner.nextInt();

    // your code goes here
    int hours = days * 24;
    int mins = hours * 60;
    int secs = mins * 60;

    System.out.println(secs);
  }
}
