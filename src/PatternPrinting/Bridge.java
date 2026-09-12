package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();


        for(int i=1;i<n;i++)
        {

            // Left Stars

            for(int j=1;j<=n-i;j++) {
                System.out.print("*");
            }

            // Middle Spaces

            for(int j=1;j<=2*i-1;j++) {
                System.out.print(" ");
            }

            // Right Stars

            for(int j=1;j<=n-i;j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
