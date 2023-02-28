package com.fileEntente.demo.services;

import com.fileEntente.demo.model.Operation;

import java.util.List;

public interface OperationService {
    List<Operation> listOperation();
    Operation saveOperation(Operation operation);
    Operation singleOperationByDate(Long id);

    Operation appellOperation();

    int getMin();
}
