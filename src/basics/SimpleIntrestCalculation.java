package basics;

import java.util.Scanner;

public class SimpleIntrestCalculation {
    public static void main(String[] args) {
        System.out.print("Enter Principal amount: ");
        Scanner sc= new Scanner(System.in);
        double P = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double R = sc.nextDouble();

        System.out.print("Enter Time: ");
        double T = sc.nextDouble();

        double number = (P*R*T/100);
        System.out.println(number);






    }
}
