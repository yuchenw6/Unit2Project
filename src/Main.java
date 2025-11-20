import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int[] numList = Game.randomNum();
        ArrayList<Integer> userNumberList = new ArrayList<>();
        int point = 0;
        int trial = 0;
        int round = 1;
        int totalPoint = 0;
        int modeTrial = 5;
        boolean playAgain = true;
        int userPlayAgain;
        System.out.print("Choose difficulty: " + "\n" + "1 = Easy (7 tries)" + "\n" + "2 = Normal (6 tries)" + "\n" + "3 = Hard (5 Tries)" + "\n" + "Difficulty: ");
        int mode = scanner.nextInt();
        while (mode < 1 || mode > 3){
            System.out.print("Re-enter the mode 1-3" + "\n" + "Difficulty: ");
            mode = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("----------------------------------------------" + "\n");
        while (playAgain){
            modeTrial = (8-mode);
            System.out.println("Round: " + round + "\n");
            System.out.println("Current Difficulty: " + mode + "\n");
            while (point < 3 && trial < modeTrial) {
                System.out.print("Enter your " + (trial+1) + " guess: ");
                guess = scanner.nextInt();
                scanner.nextLine();
                userNumberList.add(guess);
                while (guess < 0 || guess > 9){
                    System.out.print("Re-enter a integer 0-9: ");
                    guess = scanner.nextInt();
                    scanner.nextLine();
                }
                if (Game.check(guess, numList)) {
                    System.out.print("Correct, ");
                    point++;
                    totalPoint++;
                } else {
                    System.out.print("Wrong, ");
                }
                System.out.println("you still have " + ((modeTrial-1) - trial) + " tries" + "\n");
                trial++;
            }

            Game.gamePoint(point, totalPoint, trial, round, numList, userNumberList);
            System.out.println();
            System.out.print("Click any key but 0 to Play Again, 0 to Quit: ");
            userPlayAgain = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if (userPlayAgain == 0) {
                playAgain = false;
                System.out.println("GAME OVER" + "\n" + "GOOD GAME");
                totalPoint = 0;
            } else {
                System.out.print("Enter the mode you want for the new game" + "\n" + "Difficulty: ");
                mode = scanner.nextInt();
                while (mode < 0 || mode > 3){
                    System.out.print("Re-enter the mode 1-3" + "\n" + "Difficulty: ");
                    mode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                }
                System.out.println("----------------------------------------------" + "\n");
                point = 0;
                trial = 0;
                userNumberList.clear();
                round++;
            }

        }
    }
}