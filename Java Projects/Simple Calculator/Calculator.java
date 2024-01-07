import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args){
         

        Scanner Sc = new Scanner(System.in);
        System.out.println("Please Enter Your calculation using numbers and + , - , / , *");

        String equation = Sc.next();

        String[] tokens = equation.split("(?<=[-+*/])(?=.)|(?<=.)(?=[-+*/])");
        for(String t: tokens) {
            System.out.println(t);
        }


        //
        //for(int i=0; i<tokens ;i++)
        //{
        //    arr[i]=sc.nextInt();
        //}
        //
    }
}
