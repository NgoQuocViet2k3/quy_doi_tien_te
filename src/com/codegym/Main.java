package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        double vnd = 23000;
        System.out.println("Bạn hãy nhập số tiền usd: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị vnd: " + quydoi);
    }
}
