import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 56;
        System.out.println("Guess the Number!");

        while (true) {
            String input = scanner.nextLine();
            int i = Integer.parseInt(input);
            if (i == target) {
                System.out.println("You Got it!");
                break;
            }
            if (i < target){
                System.out.println("Go Higher!");
            }
            if (i > target){
                System.out.println("Go Lower!");
            }
        }
    }
}
