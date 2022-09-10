import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.println("Please enter a whole number: ");
    int userNum = scanner.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("The number is even");
    }
    else{
      System.out.println("The number is odd");
    }
  }
}
