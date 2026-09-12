package LOOPS;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        if(n==0) n=1;
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);


    }

}
