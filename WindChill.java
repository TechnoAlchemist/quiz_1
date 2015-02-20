import java.util.Scanner;
import java.text.DecimalFormat;

public class WindChill {

  public static void main(String[] args) {

    int tempC, wSpeed; 
    double tempF, wChill;
    Scanner scan = new Scanner(System.in); 

    System.out.println("Welcome to the National Weather Service's Wind Chill estimator." + "\nPlease enter the temperature in Celsius. ");
    
    System.out.println("Temperature:  ");
    tempC = scan.nextInt();

    System.out.println("Wind Speed (mph):  ");
    wSpeed = scan.nextInt();

    tempF = (1.8 * tempC) + 32;

    wChill = 35.74 + (0.6215 * tempF) + (((0.4275* tempF) - 35.75) * (Math.pow(wSpeed, 0.16))); 

    System.out.println("The wind chill is estimated to be " + (int)wChill + " degrees Fahrenheit.");
  }
}