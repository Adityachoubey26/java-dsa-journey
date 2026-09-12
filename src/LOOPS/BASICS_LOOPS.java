package LOOPS;

import java.util.Scanner;

public class BASICS_LOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);

        }

    }
//    public static void main(String[] args) {
//        for (int i=1; i<=10; i++){
//            System.out.println("Aditya");
//        }
    }

