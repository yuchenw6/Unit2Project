import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        int[] numList = Game.randomNum();
        int point = 0;
        int trial = 0;
        while (point <= 3 && trial<5){
            System.out.print("Enter your " + (trial+1) + " guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();
            if (Game.check(guess, numList)){
                System.out.println("Correct");
                point++;
            } else {
                System.out.println("Wrong");
            }
            System.out.println("You still have " + (4-trial) + " tries");
            trial++;
        }

        Game.gamepoint(point, trial);
    }
}