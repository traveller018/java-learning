package cn.tedu.hello;

import java.util.Scanner;

public class etc {
    public static void main(String[] args) {
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();
        int c=new Scanner(System.in).nextInt();

        int max= Math.max(a, b);
        max= Math.max(max, c);
        System.out.println(max);
    }
}
