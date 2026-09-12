package IFELSE;

import java.util.Scanner;

public class HOMEWORK {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
//
//        if(x % 3 == 0 && x % 5 == 0) {
//            System.out.println("Abhinav");
//        }
//        else if(x % 5 == 0) {
//            System.out.println("RIYA");
//        }
//        else if(x % 3 == 0) {
//            System.out.println("Banu");
//        }
//        else {
//            System.out.println("error");
//        }

        if(c<0) {
           c= -c;
        } if (c<69) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }



    }
}
