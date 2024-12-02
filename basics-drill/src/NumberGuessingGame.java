import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) +1;
        int userGuess;

        System.out.println("Welcome to the NUmber Guessing Game!");
        System.out.println("I have selected a number between 1 and 10");

        while(true){
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
    
            if(userGuess > randomNumber){
                System.out.println("Too High! Try Again");
            } else if (userGuess < randomNumber){
                System.out.println("Too low, Try again");
            }else {
                System.out.println("Congratulations! Your guesses it");
                break;
            }
        }
        scanner.close();
    }

    
}
