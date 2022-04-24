import java.util.Scanner;

public class ShortCircuiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("give me a y");
            String input = scanner.nextLine();
            if (input.equals("y")){
                break;
            }
            else{
                System.out.println("You gave me " + input);
            }
        }


//        String input = scanner.nextLine();
//        while (!input.equals("y")) {
//            System.out.println("You gave me " + input);
//            System.out.println("Give me a y");
//            input = scanner.nextLine();
//        }


    }


}

