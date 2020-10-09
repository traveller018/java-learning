package cn.tedu.hello;

import java.util.Scanner;

public class etc {
    public static void main(String[] args) {
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();

        int max=a>b?a:b;
        System.out.println(max);
    }
}
