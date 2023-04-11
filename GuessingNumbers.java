import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Guess a number between 0 to 100: ");

        int guess = input.nextInt();

        int num = (int)(Math.random() * 100);

        while (num != guess){
            System.out.print("That's quite not correct! Guess again: ");
            guess =input.nextInt();
        }
        System.out.println("Congrats! You have guessed the correct number!");
        
        input.close();
    }
}
