package Baitap;

import java.util.Scanner;

public class TimeConvertionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        System.out.println("Nhap vao so gio: ");
        int phut = scanner.nextInt();
        m = phut*60;
        System.out.printf( "Co %d phut",m);
        scanner.close();
    }
}
