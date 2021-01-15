import java.util.Scanner;
import java.util.Random;


public class hangman {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] gissningar = {""};

        boolean Spela = true;
        while  (Spela) {
            System.out.println("Spela Hängagubbe!");
            char[] Gissning = gissningar[random.nextInt(gissningar.length)].toCharArray();




        }

        System.out.println("Du blev hängd!");


}
}
