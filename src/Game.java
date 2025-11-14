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

    public static boolean check(int checkNum, int firstNum, int secondNum, int thridNum) {
        boolean
    }


}
