import java.util.*;

public class BandNameGenerator {
  public static void main(String[] arg) {

    Scanner scanner = new Scanner(System.in);
    // 1. TODO: Output the program greeting!
    System.out.println("Welcome to the Band Name Generator!");
    // 2. TODO: require input for the name of the city 
    System.out.println("What city did you grow up in? ");
    String city = scanner.nextLine();

    //3. TODO: Ask for the name of thier pet
    System.out.println("What is the name of your pet? ");
    String pet = scanner.nextLine();

    // 4. TODO: Combine city and pet name and display it as a band name.
    System.out.println("Your band name could be: " + city + " " + pet);
  }
}