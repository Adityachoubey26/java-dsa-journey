package LOOPS;

import java.util.Scanner;

public class continueLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();


        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
            if (i==n/2) {
                continue;
            }
            System.out.println(i + "Gm Amrita");
            
        }
    }
}
