import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int[] numList = Game.randomNum();
        int point = 0;
        int trial = 0;
        int round = 1;
        int totalPoint = 0;
        boolean playAgain = true;
        int userPlayAgain;
        System.out.println(numList[0]);
        System.out.println(numList[1]);
        System.out.println(numList[2]);
        while (playAgain){
            System.out.println("Round: " + round + "\n");
            while (point < 3 && trial < 5) {
                System.out.print("Enter your " + (trial+1) + " guess: ");
                guess = scanner.nextInt();
                scanner.nextLine();
                if (Game.check(guess, numList)) {
                    System.out.print("Correct, ");
                    point++;
                    totalPoint++;
                } else {
                    System.out.print("Wrong, ");
                }
                System.out.println("you still have " + (4 - trial) + " tries" + "\n");
                trial++;
            }

            Game.gamepoint(point, totalPoint, trial);
            System.out.print("Click 1 to Play Again, 0 to Quit: ");
            userPlayAgain = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if (userPlayAgain == 0) {
                playAgain = false;
                System.out.println("GAME OVER");
                totalPoint = 0;
            } else {
                point = 0;
                trial = 0;
                round++;
            }

        }
    }
}