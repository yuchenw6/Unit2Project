import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public static int[] randomNum() {
        int[] num = {0, 0, 0};

        for (int i = 0; i<3; i++){
            while (num[i%3] == num[(i+1)%3] || num[i%3] == num[(i+2)%3]){
                num[i] = (int) (Math.random() * 10);
            }
        }
        return num;
    }

    public static boolean check(int checkNum, int[] list) {
        boolean result = false;
        for (int i = 0; i<3;i++){
            if (checkNum == list[i]){
                result = true;
            }
        }
        return result;

    }
    public static void gamePoint(int point, int totalPoint, int trial, int round, int[] list, ArrayList<Integer> userNumberList){
        ArrayList<Integer> correctGuess = new ArrayList<>();
        System.out.println("----------------------------------------------");
        System.out.print("Your guesses: ");
        for (int i = 0; i<userNumberList.size(); i++){
            System.out.print(userNumberList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("The mystery Number are: " + list[0] + ", " + list[1] + ", " + list[2]);
        System.out.println("Correct Rate: " + point + "/" + trial);
        System.out.println("Point gain this round: " + point);
        System.out.println("Total Round Played: " + round);
        System.out.println("Total point: " + totalPoint);
        System.out.println("----------------------------------------------" + "\n");
    }
    
    public static int getDifficulty(Scanner scanner) {
    System.out.print("Choose difficulty: \n" + "1 = Easy (7 tries)\n" + "2 = Normal (6 tries)\n" + "3 = Hard (5 Tries)\n" + "Difficulty: ");

    int mode = scanner.nextInt();
    scanner.nextLine();
    while (mode < 1 || mode > 3) {
        System.out.print("Re-enter the mode 1-3\nDifficulty: ");
        mode = scanner.nextInt();
    }

    System.out.println("----------------------------------------------\n");

    return mode;
    }
    
    public static void hint(int guess, int[] list) {
        boolean hasHigher = false;
        boolean hasLower = false; 

        for (int i = 0; i<3; i++) {
            if (guess < list[i]) {
                hasHigher = true;
            } else if (guess > list[i]) {
                hasLower = true;
            }
        }

        if (hasHigher && !hasLower) {
            System.out.println("All number are higher than this");
        } else if (hasLower && !hasHigher) {
            System.out.println("All number are lower than this");
        } else {
            System.out.println("There are both higher and lower number than this");
        }
    }
}