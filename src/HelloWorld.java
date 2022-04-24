import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        var x = scanner.nextLine();
        System.out.println("Thats cool! Your name is " + x);
        System.out.println("are you gay?");
        var y = scanner.nextLine();


    }
}
