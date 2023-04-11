import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int guess=-1;

        int num = (int)(Math.random() * 100);

        while (guess != num){
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == num){
                System.out.println("Congrats! You have guessed the correct number " + guess);
            }
            else if (guess > num){
                System.out.println("Not quite there! The guess is too high.");
            }
            else{
                System.out.println("Not quite there! The guess is too low.");
            }
        }        
        input.close();
    }
}
