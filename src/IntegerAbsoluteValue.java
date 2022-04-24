import java.util.Scanner;

public class IntegerAbsoluteValue {

    public static void main(String[] args) {

        System.out.println("give me an integer");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int i = Integer.parseInt(number);
        if(i > 0)
            System.out.println(i);
        else
            i = i * -1;
            System.out.println(i);



    }

}
