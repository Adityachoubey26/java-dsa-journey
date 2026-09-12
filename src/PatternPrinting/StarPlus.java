package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n= sc.nextInt();

        for (double i=1; i<=n; i++){
            for (double j=1; j<=n; j++){
                if (i==j && j==i){
                    System.out.print("* ");
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }
}
