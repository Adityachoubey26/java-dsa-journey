package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareprintofNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double number = Math.pow(x,2);
        System.out.print("Square of the number is: ");
        System.out.println(number);

    }
}
