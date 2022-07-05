// #: TODO 1. import scanner
import java.util.Scanner;

public class ChatBot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // # Greeting
    System.out.println("Hello, What is your name?\n");

    // user name
    String name = scanner.nextLine();

    System.out.println("Hi " + name + ", I am JavaBot." + " Where are you from?\n");

    // Place
    String place = scanner.nextLine();
    System.out.println("I hear its beautiful at " + place + "! I'm from place called Oracle." + "\nHow old are you?\n");

    int age = scanner.nextInt();
    System.out.println("So, you are " + age + ". I'm " + (age * 8) + " years old." + " Which means I am 8 times older than you\n");

  }
}