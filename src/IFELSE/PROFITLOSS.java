package IFELSE;

import java.util.Scanner;

public class PROFITLOSS {
    public static void main(String[] args) {
        System.out.print("Enter cp: ");
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.print("Enter sp: ");
        int sp = sc.nextInt();

        if(sp>cp) {
            System.out.print("Profit of: ");
            System.out.println(sp-cp);

        } else if ( sp == cp){
            System.out.println("NOT LOSS NOT PROFIT");
        } else {
            System.out.print("Loss of: ");
            System.out.println(cp-sp);
        }


    }
}
