package Baitap;

import java.util.Scanner;

/**
 * Circle
 */
public class Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double S;
        double C;
        System.out.println("Nhap r: ");
        int bk = scanner.nextInt();
        S = Math.pow(bk,2)* 3.14;
        System.out.printf("Dien tich hinh tron la: %f \n",S);
        C = 2 * 3.14 * bk;
        System.out.printf("Chu vi hinh tron la: %f",C);
        scanner.close();
    }
}