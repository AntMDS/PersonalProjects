import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args){

        char operator;
        double Number1, Number2, Result;
         
        Scanner Sc = new Scanner(System.in);

        System.out.println("Please Enter Your First number");
        Number1 = Sc.nextDouble();

        System.out.println("Please enter a operator + , - , / , *");
        operator = Sc.next().charAt(0);

        System.out.println("Please Enter Your Last number");
        Number2 = Sc.nextDouble();

        if (operator == '+') {
            Result = Number1 + Number2;
        } else if (operator == '-') {
            Result = Number1 - Number2;
        } else if (operator == '/') {
            Result = Number1 / Number2;
        } else if (operator == '*') {
            Result = Number1 * Number2;
        } else {
            System.out.println("An  error has occured");
            return;
        }

        System.out.println("Result: " + Result);
    }
}
