package PatternPrinting;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
//                for (int i = 1; i<=4; i++){
//                    System.out.println("* * * *");
//                }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Columns: ");
        int columns = sc.nextInt();
        System.out.print("Enter Number of rows");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { //kitne lines(rows) honge
            for (int j = 1; j <= columns; j++) { //Har line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();


        }


    }
}