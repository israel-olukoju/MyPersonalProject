import java.util.Scanner;

public class LotteryGame {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Lottery number
        int lotteryNumber1 = (int)(Math.random() * 100);
        int lotteryNumber2 = (int)(Math.random() * 100);
        int lotteryNumber3 = (int)(Math.random() * 100);
        int lotteryNumber4 = (int)(Math.random() * 100);

        // Prompt user for lottery number
        System.out.print("Enter first lottery number: ");
        int guess1 = input.nextInt();
        System.out.println("Enter guess: L1 L2 L3 L4");
        System.out.println("             " + guess1);
        int guess2 = input.nextInt();
        System.out.println("Enter guess: L1 L2 L3 L4");
        System.out.println("             " + guess1 + " " + guess2);
        int guess3 = input.nextInt();
        System.out.println("Enter guess: L1 L2 L3 L4");
        System.out.println("             " + guess1 + " " + guess2 + " " + guess3);
        int guess4 = input.nextInt();
        System.out.println("Enter guess: L1 L2 L3 L4");
        System.out.println("             " + guess1 + " " + guess2 + " " + guess3 + " " + guess4);

        // LOTTERY ENGINE

        // Exact winning number
        boolean exactWinningLottery = guess1 == lotteryNumber1 && guess2 == lotteryNumber2 && guess3 == lotteryNumber3 && guess4 == lotteryNumber4;
        // Exact winning number but not the right position
        boolean notExactButWinningLottery = guess1 == lotteryNumber2 || guess1 == lotteryNumber3 || guess1 == lotteryNumber4 || guess2 == lotteryNumber1 || guess2 == lotteryNumber3 || guess2 == lotteryNumber4 || guess3 == lotteryNumber1 || guess3 == lotteryNumber2 || guess3 == lotteryNumber4 || guess4 == lotteryNumber1 || guess4 == lotteryNumber2 || guess4 == lotteryNumber3;
        // Only one correct number
        boolean oneCorrectWinningLottery = guess1 == lotteryNumber1 || guess1 == lotteryNumber2 || guess1 == lotteryNumber3 || guess1 == lotteryNumber4 || guess2 == lotteryNumber1 || guess2 == lotteryNumber2 || guess2 == lotteryNumber3 || guess2 == lotteryNumber4 || guess3 == lotteryNumber1 || guess3 == lotteryNumber2 || guess3 == lotteryNumber3 || guess3 == lotteryNumber4 || guess4 == lotteryNumber1 || guess4 == lotteryNumber2 || guess4 == lotteryNumber3 || guess4 == lotteryNumber4;

        // Input lottery fee of $50
        System.out.print("Enter lottery fee $50: ");
        int lotteryFee = input.nextInt();
        if (lotteryFee == 50) {
            if (exactWinningLottery) {
                System.out.println("Congratulation, you won $1,000,000");
            } else if (notExactButWinningLottery) {
                System.out.println("Congratulation, you won $500,000");
            } else if (oneCorrectWinningLottery) {
                System.out.println("Congratulation, you won $50,000");
            }
            else {
                System.out.println("Try again next time");
            }
        }
        else {
            System.out.println("Insufficient Amount");
        }
        System.out.println("The wining lottery number is " + lotteryNumber1 + " " + lotteryNumber2 + " " + lotteryNumber3 + " " + lotteryNumber4);
        System.out.println("Check your lottery number>>  " + guess1 + " " + guess2 + " " + guess3 + " " + guess4);

    }
}
