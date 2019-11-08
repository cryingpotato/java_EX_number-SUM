package com.example.lib;

public class MyClass {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input :");
        int inp=scanner.nextInt();
        int sum=0;
        for (int n=1;n<=inp;n++)
        {
            sum+=n;
        }
        System.out.println("Ans:"+sum);
    }
}
