import java.util.*;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000)+1;

        int guess;
        int attempts = 0;
        int maxAttempts = 100;

        System.out.println("GUESS A NUMBER BETWEEN 1 TO 1000. YOU HAVE 100 CHANCES!");

        while(attempts < maxAttempts) {
            System.out.println("ENTER YOUR GUESS :");

            guess = sc.nextInt();
            attempts++;

            if(guess == number){
                System.out.println("CORRECT! YOU GUESSED IT IN " + attempts + " attempts.");
                break;

            }else if (guess < number) {
                System.out.println("TOO LOW!");

            }else {
                System.out.println("TOO HIGH!");
            }

            }
           if (attempts == maxAttempts){
            System.out.println("SORRY! YOU'VE USED ALL 100 CHANCES. "+ number);

           } 
        sc.close();
    }
}