package com.teachmeskills.lesson_28.entity;

import com.teachmeskills.lesson_28.service.CalcService;

public class Operation {

    private final double num1;
    private final double num2;
    private final String operand;
    private final double result;
    private final User user;

    public Operation(double num1, double num2, String operand, double result, User user) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
        this.result = result;
        this.user = user;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperand() {
        return operand;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "User: " + user.getName() +
                " [" + num1 + " " +
                CalcService.operand(this.operand) +
                " " + num2 + " = " + result + "]";
    }

}
