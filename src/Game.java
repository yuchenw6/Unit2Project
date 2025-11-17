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
    public static void gamepoint(int gamepoint, int trial){
        System.out.println("You got " + gamepoint + " out of " + trial + " correct!");
    }
}
