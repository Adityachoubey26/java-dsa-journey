package IFELSE;

import java.util.Scanner;

public class LOGICALANDOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if(x%3==0 && x%5==0) {
            System.out.println("Riya");
        } else if(x%3==0) {
            System.out.println("Banu");
        } else if(x%5==0) {
            System.out.println("Amrita");
        } else{
            System.out.println("Aditya");
        }


    }
}
