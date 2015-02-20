/* Gabriel Lafontant glafonta@gmail.com*/

import java.util.Scanner;

public class Maximum {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int value1, value2, value3;
    int avg = 0;

    System.out.println("Welcome to the Maximumus. A text-based program that calculates the min, max and mean values of integers");

    System.out.println("You will need to enter three integers to begin.");

    System.out.print("Please enter the first integer: ");
    value1 = scan.nextInt();

    System.out.print("Please enter the second integer: ");
    value2 = scan.nextInt();

    System.out.print("Please enter the third integer: ");
    value3 = scan.nextInt();

    avg = (value1 + value2 + value3) / 3;

    System.out.println("The minimum value of the three intergers are: " + Math.min(value1, Math.min(value2, value3)));

    System.out.println("The maximum value of the three intergers are: " + Math.max(value3, Math.max(value1, value2)));

    System.out.println("The mean of the three intergers are: " + avg);

  }

}
