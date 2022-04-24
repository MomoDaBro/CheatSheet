import java.util.Scanner;
public class Athromatic {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in cents");
        String cent = scanner.nextLine();
        int cent2 = Integer.parseInt(cent);

        int quarter = cent2 / 25;
        System.out.println("There are " + quarter + " quarters from this");

        int dimes =  (cent2-(quarter*25)) / 10;
        System.out.println("There are " + dimes + " dimes from this");

        int nickle = (cent2-(quarter*25)-(dimes*10)) / 5;
        System.out.println("There are " + nickle + " nickles from this");

        int penny = (cent2-(quarter*25)-(dimes*10)-(nickle*5));
        System.out.println("There are " + penny + " pennies from this");
    }
}
