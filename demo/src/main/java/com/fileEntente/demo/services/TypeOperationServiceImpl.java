package com.fileEntente.demo.services;

import com.fileEntente.demo.model.TypeOperation;
import com.fileEntente.demo.repository.TypeOperationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class TypeOperationServiceImpl implements TypeOperationServices{
    private TypeOperationRepository typeOperationRepository;
    @Override
    public List<TypeOperation> listTypeOperation() {
        return typeOperationRepository.findAll();
    }

    @Override
    public TypeOperation saveType(TypeOperation typeOperation) {
        return typeOperationRepository.save(typeOperation);
    }
}
