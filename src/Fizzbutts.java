public class Fizzbutts {

    public static void main(String[] arg) {


//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//
//            }
//            System.out.println(i);
//        }
        for (int i = 0; i <= 100; i++) {
            String output = "";

            if (i % 3 == 0) {
                output = "Fizz";
            }
            if (i % 5 == 0) {
                output = output + "Buzz";
            }
            if (output.equals("")) {
                output = "" + i;

            }
            System.out.println(output);
        }
    }
}
