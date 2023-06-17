//Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard.
// When user input q, program will be quit.
// If user inputs another character, then the program will ask to input the number again.
import java.util.Scanner;
public class sum_user_input {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                System.out.println("Enter numbers to add (enter 'q' to quit):");
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        sum += num;
                    } else if (scanner.hasNext("q")) {
                        scanner.next();
                        break;
                    } else {
                        System.out.println("Invalid input.");
                        scanner.next();
                    }
                }
                System.out.println("The sum is: " + sum);
                scanner.close();
            }
        }


