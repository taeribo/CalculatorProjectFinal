package com.example.calculator;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String exit = "";
        while (!exit.equals("exit"))
        {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요.");
            }


            System.out.println("두 번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요 ");
            }

            System.out.println("사칙 연산 기호(+,-,*,/)를 입력하세요");
            char op = sc.next().charAt(0);
            System.out.println("연산 기호 : " + op);

            Integer result = calculator.calculate(num1,num2,op);




            System.out.println("결과 : " + result);
            System.out.println("저장된 계산 결과 : " );
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료) / 계속 하려면 아무 키 입력.");
            exit = sc.next();
        }
    }
}

