import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");

        String hex = input.nextLine();
        
        if (hex.length() != 1){
            System.out.print("You must enter exactly one character");
            System.exit(1);
        }
        
        char ch = Character.toUpperCase(hex.charAt(0));
        if ('A' <= ch && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is "+ value );
        }
        else if(Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit " + ch + " is "+ ch);
        }
        else{
            System.out.println(ch + " is an invalid input");
        }
        input.close();
    }
}
