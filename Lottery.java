import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int guess = input.nextInt();

        int lotdig1 = lottery / 10;
        int lotdig2 = lottery % 10;

        int guessdig1 = guess / 10;
        int guessdig2 = guess % 10;

        System.out.println("The lottery number is: " + lottery);


        if (guess == lottery){
            System.out.println("Congratulations! It's an exact match. You win $10,000.");
        }
        else if ((guessdig2 == lotdig1) && (guessdig1 == lotdig2)){
            System.out.println("Congratulations! You won $3000");
        }
        else if ((guessdig1 == lotdig1) || (guessdig1 == lotdig2) || (guessdig2 == lotdig1) || (guessdig2 == lotdig2)){
            System.out.println("Congratulations! You won $1000");

        }
        input.close();
    }

}
