package basics;

import java.util.Scanner;

public class Scanner_ClassJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r= sc.nextDouble();
        double value= Math.PI*r*r;
        System.out.println(value);

    }
}
