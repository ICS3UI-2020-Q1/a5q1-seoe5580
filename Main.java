import java.util.Scanner;
/**
 * This program will make a mutilplication table based off of user's number
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a integer
    System.out.println("Please enter an integer to create a multiplication table for");
    
    // Gets the number from the user
    int num = input.nextInt();

    // using for loop makes the variable i mutiply with the user's number
    for(int i = 1; i <= 12; i++){
      System.out.println(i + " x " + num + " = " + (i * num));
    }
    
  }
}
