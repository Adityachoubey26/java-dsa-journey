package LOOPS;

import java.util.Scanner;

public class Ap_basics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = 2; i <= 3*n-1 ; i=i+3) {
//            System.out.println(i);
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int x = sc.nextInt();
        System.out.print("Enter term from which it should be exceeded: ");
        int y = sc.nextInt();
        System.out.print("Enter terms u want to run: ");
        int n = sc.nextInt();

        for (int i = x; i <= 3*n-1 ; i+=y) {
            System.out.println(i);

        }
    }
}
