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
            System.out.println("저장된 계산 결과 : " + calculator.getResults() );
            System.out.println("먼저 저장된 결과를 삭제하십니까? (yes) / 계속 하려면 아무 키 입력.");
            String answer = sc.next();
            if("yes".equals(answer)){
                calculator.removeResults();
                System.out.println("가장 먼저 계산된 결과 삭제 후  : " + calculator.getResults());
            }
            System.out.println("계산기 종료를 원하면 exit 입력, / 계속하려면 아무 키 입력");
            exit = sc.next();
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}

