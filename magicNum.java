import java.util.Random;
import java.util.Scanner;

class Guess {

    public static void main(String[] args) {
        int secret, user;
        int upperLimit = 100;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();//instancw
        
        boolean guessedCorrect = false;//coz the game hasn't guessed correctly.

        secret = ran.nextInt(upperLimit) + 1;

        while (!guessedCorrect) {
            System.out.print("Guess between 1 and 100: ");
            user = sc.nextInt();

            if (user > secret) {
                System.out.println("Too high bro, try again");
            } else if (user < secret) {
                System.out.println("Too low bro, try again");
            } else {
                System.out.println("Congo! You guessed the number.");
                guessedCorrect = true;
            }
        }
        
      sc.close();
    }
}

