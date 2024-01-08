import java.util.Scanner;

public class ArrayNumberSorter {
    /**
     * @param args
     */
    public static void main(String[] args){
         
        Scanner Input = new Scanner(System.in);
        int array[] = new int[10];

        System.out.println("Please Enter Your numbers (max of 10)");
        for(int i=0; i<array.length ;i++)
        {
            array[i]=Input.nextInt();
        }

        for(int number : array) {
            if (number % 2 == 0){
                System.out.println("this is an evan number:"+ number);
            } else if (number % 2 != 0){
                System.out.println("this is an odd number:"+ number);
            }
        }
    }
}