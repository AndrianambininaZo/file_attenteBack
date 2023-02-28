package com.fileEntente.demo.services;

import com.fileEntente.demo.model.TypeOperation;

import java.util.List;

public interface TypeOperationServices {
    List<TypeOperation> listTypeOperation();
    TypeOperation saveType(TypeOperation typeOperation);
}
