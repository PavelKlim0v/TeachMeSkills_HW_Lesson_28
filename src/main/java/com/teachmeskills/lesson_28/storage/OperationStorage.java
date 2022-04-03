package com.teachmeskills.lesson_28.storage;

import com.teachmeskills.lesson_28.entity.Operation;
import java.util.ArrayList;
import java.util.List;

public class OperationStorage {

    private static final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getAll() {
        return new ArrayList<>(operations);
    }

}
