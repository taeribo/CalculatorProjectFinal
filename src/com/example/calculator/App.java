package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        if(num1 <0){
            System.out.println("0을 포함한 양의 정수를 입력하세요.");
        }


        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();
        if(num2 <0){
            System.out.println("0을 포함한 양의 정수를 입력하세요 ");
        }

        System.out.println("사칙 연산 기호(+,-,*,/)를 입력하세요");
        char op = sc.next().charAt(0);
        System.out.println("연산 기호 : " + op);

        int result;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("지원하지 않는 연산자");
                return;

            }
        }
        System.out.println("결과 : " + result);
    }
}

