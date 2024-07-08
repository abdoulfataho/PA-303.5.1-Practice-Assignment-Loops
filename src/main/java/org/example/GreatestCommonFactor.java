package org.example;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two positive integers: ");
        System.out.println("Integer 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Integer 2 : ");
        int n2 = sc.nextInt();

        for (int i = 1; i <= n1 && i <= n2; i++) {

            if (n1 % i == 0 & n2 % i == 0) {

                System.out.println("The GCD is: " + i);

            }
        }
    }
}
