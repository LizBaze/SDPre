import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;

    printMenu();

    while(true){
      selection = scanner.nextInt();

      if(selection == 1) {
        System.out.println("Hello Human");
      }
      else if(selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
      else {
        System.out.println("Invalid Selection");
      }

    }

  }



   public static void printMenu() {
     System.out.println("____Menu____");
     System.out.println("1: Say Hello");
     System.out.println("2: List my favorite foods");
     System.out.println("3: Exit");
     System.out.println();
   }

}
