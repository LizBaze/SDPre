import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("How old are you?");
    age = scanner.nextInt();

    //I don't know how to check the year automatically yet so I'll get the user's input instead
    System.out.println("What year is it?");
    currentYear = scanner.nextInt();

    birthYear = currentYear - age;
    //This doesn't account for birth month and so may be inaccurate in certain cases

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
