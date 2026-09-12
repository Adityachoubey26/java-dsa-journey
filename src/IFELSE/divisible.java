package IFELSE;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

//        if(x%3==0 && x%5==0){
//            System.out.println("Number is divisible by both");
//        } else if(x%3==0) {
//            System.out.println("number is divisible by 3");
//        } else if(x%5==0) {
//            System.out.println("Number is Divisible by 5");
//        } else {
//            System.out.println("Number is not dividible by 5 or 3");
//        }
        if (x % 3==0 || x % 5==0) {
            System.out.println("Number is divisible by 5 or 3");
        } else {
            System.out.println("Not valid");
        }


    }
}
