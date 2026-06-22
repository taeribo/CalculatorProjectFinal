package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<Integer> results = new ArrayList<>();
    public Integer calculate(int num1, int num2, char op) {
        int result;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");

                }
                result = num1 / num2;
            }
            default -> throw new ArithmeticException("지원하지 않는 연산자");
        }
            results.add(result);
            return result;

        }
    }

