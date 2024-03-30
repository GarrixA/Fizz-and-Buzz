import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Game started");
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Enter a number: ");
            try {
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Game must be played with only numbers");
                scanner.next();
            }
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.print("Game ends here you've got ");
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0) {
            System.out.print("Game ends here you've got ");
            System.out.print("Buzz");
        }
        else if (number % 5 == 0) {
            System.out.print("Game ends here you've got ");
            System.out.println("Fizz");
        }
        else {
            System.out.print("Game ends here you've got ");
            System.out.println(number);
            System.out.print("No any of Fizz or Buzz");
        }
    }
}