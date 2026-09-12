package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

//        for (int i = 1; i<=n; i++){
//            for (int j=1; j<=i; j++) {
//                System.out.print((char)(j+64)+" ");
//
//
//            }
//            System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
                System.out.println((char)(i+64)+" "+(char)(i+65));
            }
            System.out.println();

        }

    }
}

