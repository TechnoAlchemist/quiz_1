import java.util.Scanner;
import java.text.DecimalFormat;

public class WindChill {

  public static void main(String[] args) {

    int fahrenheit, celsius; 
    double wChill;
    Scanner scane = new Scanner(System.in); 

    System.out.println("Welcome to the National Weather Service's Wind Chill estimator." + "\nPlease enter the temperature in Celsius. ");
    System.out.println("Temperature:  ");

    celsius = scan.nextDouble();

    fahrenheit = (1.8 * celsius) + 32;

    wChill = 35.74 + (0.6215 * fahrenheit) + ((0.4275 * fahrenheit) - 35.75)



  }
}