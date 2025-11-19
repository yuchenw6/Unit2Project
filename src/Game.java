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
    public static void gamePoint(int point, int totalPoint, int trial, int round){
        System.out.println("----------------------------------------------");
        System.out.println("Correct Rate: " + point + "/" + trial);
        System.out.println("Point gain this round: " + point);
        System.out.println("Total Round Played: " + round);
        System.out.println("Total point: " + totalPoint);
        System.out.println("----------------------------------------------" + "\n");
    }
}
