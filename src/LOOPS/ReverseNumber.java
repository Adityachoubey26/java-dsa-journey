package LOOPS;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int rev = 0;// rev ko 0 se initialze kara
        while (n!=0){ // jab tak n 0 na ho tab tak chlega loop
            int digit=n%10; //last digit nikala n ka
            rev = rev*10+digit; // rev ko 10 se multiply kra like 0 tha 0 raha then lastdigit add kra n ka to wo bana and then so on
            n=n/10;// last digit ko remove krke new n banya and same whi repeat

        }
        System.out.println(rev); //print krdia rev ko

    }
}
