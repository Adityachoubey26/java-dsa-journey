package PatternPrinting;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
           for (int j=1; j<=n; j++) {
                System.out.print(j+" ");


            }
            System.out.println();

        }
    }
}