package IFELSE;

import java.util.Scanner;

public class trianglesides {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter length: ");
        int b = sc.nextInt();
        System.out.print("Enter length: ");
        int h = sc.nextInt();

        if(l+b>h && l+h>b && h+b>l) {
            System.out.println("This is sides of the triangle");
        } else {
            System.out.println("Not triangle side");
        }
    }
}
