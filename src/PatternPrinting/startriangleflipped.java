package PatternPrinting;

import java.util.Scanner;

public class startriangleflipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){ //n+1-i because i+j max is always n+1
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
