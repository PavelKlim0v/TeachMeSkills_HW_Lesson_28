package com.teachmeskills.lesson_28.service;

import com.teachmeskills.lesson_28.entity.Operation;
import com.teachmeskills.lesson_28.entity.User;
import com.teachmeskills.lesson_28.storage.OperationStorage;
import java.util.List;

public class CalcService {

    private static final OperationStorage operationStorage = new OperationStorage();

    public List<Operation> findAll() {
        return operationStorage.getAll();
    }

    public Double calc(double a, double b, String operand, User user) {
        switch (operand) {
            case "sum": {
                return getOperation(a, b, operand, a + b, user);
            }
            case "min": {
                return getOperation(a, b, operand, a - b, user);
            }
            case "div": {
                return getOperation(a, b, operand, a / b, user);
            }
            case "mult": {
                return getOperation(a, b, operand, a * b, user);
            }
        }
        return null;
    }

    public Double getOperation(double a, double b, String operand, double result, User user) {
        Operation operation = new Operation(a, b, operand, result, user);
        operationStorage.save(operation);
        return result;
    }

    public static String operand(String operand) {
        if (operand.equals("sum")) {
            return "+";
        } else if (operand.equals("min")) {
            return "-";
        } else if (operand.equals("div")) {
            return "*";
        } else if (operand.equals("mult")) {
            return "/";
        }
        return "Operand not exists!";
    }

}
