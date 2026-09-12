package IFELSE;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
