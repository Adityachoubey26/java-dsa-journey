package basics;

import java.util.Scanner;

public class Sumof3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 1st Number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3d Number: ");
        int c= sc.nextInt();

        System.out.println(a+b+c);

    }
}
