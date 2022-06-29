import java.util.*;

public class NumberOfCharacters {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your name?");
    String name = scan.nextLine();

    System.out.println("There are " + name.length() + " Characters in your name!");
    
  }
}