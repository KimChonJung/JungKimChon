package Baitap;

import java.util.Scanner;

/**
 * Person
 */
public class Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        System.out.println("Nhap nam sinh cua ban: ");
        int ns = scanner.nextInt();
        T = 2024- ns;
        System.out.println("Tuoi cua ban la: "+T);
        scanner.close();
    }
}