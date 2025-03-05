
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random die = new Random();

        while (true) {
            startGame(scanner, die);
            System.out.println("Play again? (y/n)");
            String playAgain = getYOrN(scanner, "Must type y or n");

            if (playAgain.equals("y")) {
                continue;
            } else if (playAgain.equals("n")) {
                break;
            }
        }
    }

    public static void startGame(Scanner scanner, Random die) {
        int userRoll = 0;
        int machineRoll = 0;

        while (true) {
            if (userRoll == 0) {
                userRoll += throwDice(die);
                System.out.println("You start out with a: " + userRoll);
            }

            System.out.println("Do you want to roll the dice again (y/n)");
            String rollAgain = getYOrN(scanner, "Must type y or n");

            if (rollAgain.equals("y")) {
                userRoll += throwDice(die);
                if (checkBlackjack(userRoll)) {
                    System.out.println("BlackJack! You win! ");
                    break;
                }
                if (checkIfOver21(userRoll)) {
                    System.out.println("you exceeded 21, Machine win!");
                    break;
                }
                System.out.println("You now have: " + userRoll);
            }

            if (rollAgain.equals("n")) {
                break;
            }
        }

        if (userRoll < 21) {
            while (machineRoll < 16) {
                machineRoll += throwDice(die);
            }
            System.out.println(checkWinner(userRoll, machineRoll));
        }
    }

    public static boolean checkBlackjack(int userRoll) {
        return (userRoll == 21);
    }

    public static boolean checkIfOver21(int roll) {
        return (roll > 21);
    }

    public static String checkWinner(int userRoll, int machineRoll) {
        if (checkIfOver21(machineRoll)) {
            return "Machine exceeded 21, you win!";
        }
        if (machineRoll <= 21 && machineRoll > userRoll) {
            return "Machine win!" + results(userRoll, machineRoll);
        }
        if (userRoll > machineRoll) {
            return "You win!" + results(userRoll, machineRoll);
        }
        return "It is a draw!" + results(userRoll, machineRoll);
    }

    public static int throwDice(Random die) {
        return die.nextInt(1, 7) + die.nextInt(1, 7);
    }

    public static String results(int userRoll, int machineRoll) {
        return "\n" + "You got " + userRoll + "\n" + "Machine got " + machineRoll;
    }

    public static String getYOrN(Scanner sc, String errormessage) {
        while (true) {
            String choice = sc.nextLine();
            if (choice.equals("y")) {
                return choice;
            } else if (choice.equals("n")) {
                return choice;
            } else {
                System.out.println(errormessage);
            }
        }
    }
}