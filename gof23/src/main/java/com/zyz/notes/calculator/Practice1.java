package com.zyz.notes.calculator;

import java.util.Scanner;

/**
 * Created by ZhangYuanzhuo on 2017/1/14.
 */
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入数字A:");
            double numA = sc.nextDouble();
            System.out.println("请输入运算符号:");
            String operator = sc.next();
            if(!(operator.length()==1&&"+-*/".contains(operator))) {
                System.out.println("请输入正确的符号！");
                return;
            }
            System.out.println("请输入数字B:");
            double numB = sc.nextDouble();
            if(numB==0&&operator.equals("/"))
                System.out.println("除数不能为0！");
            System.out.println("您的运算结果是:");
            System.out.println(numA+operator+numB+"="+calculate(numA, numB, operator));
        } catch (Exception e) {
            System.out.println("请输入正确的格式！");
        }
    }

    private static double calculate(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}
