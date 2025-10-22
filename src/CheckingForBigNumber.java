import java.util.Scanner;

public class CheckingForBigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 > number1 || number1 > number2) {
            System.out.println("The biggest among the two is " + Math.max(number1, number2));
        }
        else {
            System.out.println("The numbers are same");
        }
    }
}
