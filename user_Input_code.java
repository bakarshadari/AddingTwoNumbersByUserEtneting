package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = input.nextInt();
        System.out.println(input.nextLine());
        System.out.println("enter number 2 ");
        int num2 = input.nextInt();
        sum = num1+num2;
        System.out.println("the total of "+ num1 +"\t"+"+"+ num2 +"\t"+""+"is"+"\n"+ sum);

    }
}
