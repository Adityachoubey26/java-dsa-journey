package IFELSE;

import java.util.Scanner;

public class AreaParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth: ");
        int b = sc.nextInt();

        if(l*b>2*l+2*b){
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
