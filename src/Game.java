import java.util.ArrayList;

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
}