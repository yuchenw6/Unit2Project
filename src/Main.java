import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        int [] numList = Game.randomNum();
        for (int i = 0; i<5; i++){
            System.out.print("Enter your " + (i+1) + " guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();

        }





    }
}
