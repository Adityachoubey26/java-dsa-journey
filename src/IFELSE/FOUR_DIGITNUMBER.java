package IFELSE;

import java.util.Scanner;

public class FOUR_DIGITNUMBER {
    public static void main(String[] args) {
        System.out.print("Enter a postive integer: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=999 && x<=10000){
            System.out.println("FOUR DIGIT NUMBER");
        } else {
            System.out.println("Not a four digit number");
        }
    }
}
