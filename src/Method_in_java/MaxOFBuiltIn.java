package Method_in_java;

import java.util.Scanner;

public class MaxOFBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(Math.max(a, b));
        System.out.println(Math.max(b, c));
        System.out.println(Math.max(a, c));





    }
}
