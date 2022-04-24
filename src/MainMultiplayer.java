import java.util.Scanner;

public class MainMultiplayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a Number for your friend to guess!");

        String number = scanner.nextLine();
        int target = Integer.parseInt(number);



        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Alright! Lets-a-go!");
        System.out.println("Guess the Number!");

        while (true) {
            String input = scanner.nextLine();
            int i = Integer.parseInt(input);
            if (i == target) {
                System.out.println("You Got it!");
                break;
            }
            if (i < target) {
                System.out.println("Go Higher!");
            }
            if (i > target) {
                System.out.println("Go Lower!");
            }
        }
    }
}
