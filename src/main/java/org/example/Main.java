package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        int a,b,c,d;
        for (int e=0;e!=-1;) {
            y = Math.random() * 10;
            a = (int) y + 1;
            y = Math.random() * 10;
            b = (int) y + 1;
            y = Math.random() * 10;
            c = (int) y + 1;
            y = Math.random() * 10;
            d = (int) y + 1;
            System.out.println("1)triangle\n2)distance\n3)powerLoop\n4)power\n5)tribonacci");
            int t = scanner.nextInt();
            switch (t) {
                case 1 -> System.out.println(triangle(a, b, c));
                case 2 -> System.out.printf("%.2f", distance(a, b, c, d));
                case 3 -> System.out.println(powerLoop(a, b));
                case 4 -> System.out.println(power(a, b));
                case 5 -> {
                    System.out.println("n=" + d);
                    System.out.println(tribonacci(25));
                }
                case 0 -> e = -1;
                default -> {
                }
            }
        }
    }

    public static boolean triangle(int a, int b, int c) {
        System.out.println("--------------------\n"+"a=" + a + "\nb=" + b + "\nc=" + c);
        if ((a + b <= c)||(a + c <= b)||(b + c <= a)) return false;
        else return true;
    }

    public static double distance(float x1, float x2, float y1, float y2) {
        System.out.println("--------------------\n"+"x1=" + x1 + "\nx2=" + x2 + "\ny1=" + y1+"\ny2="+y2);
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double powerLoop(float a, int n) {
        System.out.println("--------------------\n" + "a=" + a + "\nn=" + n);
        if (a == 0 && n < 0) {
            System.out.println("Expected IllegalArgumentException for a=0 and n<0");
            return -1;
        } else {
            double temp = a;
            if (n == 1) {
                return a;
            } else if (n == 0) {
                return 1;
            } else {
                for (int i = 0; i < Math.abs(n) - 1; i++) {
                    temp *= a;
                }
                if (n < 0) {
                    temp = 1 / temp;
                }
                return temp;
            }
        }
    }
    public static double power(float a,int n){
        double temp=a;
            temp = temp * Math.pow(a, n - 1);
        return temp;
    }
    public static int tribonacci(int n) {
        if (n<0) return 0;
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
}