package IFELSE;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        double x = sc.nextDouble();
//        System.out.println((x%2==0) ? "Even":"Odd4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double x = sc.nextDouble();

        String  y = (x>=0) ? "Valid" : "Invalid";


        System.out.println(y);



    }
}
