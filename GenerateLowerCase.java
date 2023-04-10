import java.util.Random;

public class GenerateLowerCase {
    public static void main(String[] args){
        Random rnd = new Random();

        char randomchar = (char)('a' + rnd.nextInt(26));
        System.out.println(randomchar); 
    }
}
