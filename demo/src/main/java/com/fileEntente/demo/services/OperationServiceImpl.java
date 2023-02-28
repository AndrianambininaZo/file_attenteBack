package com.fileEntente.demo.services;

import com.fileEntente.demo.model.Operation;
import com.fileEntente.demo.repository.OperationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class OperationServiceImpl implements OperationService{
    private OperationRepository operationRepository;
    @Override
    public List<Operation> listOperation() {
        return operationRepository.findAll();
    }

    @Override
    public Operation saveOperation(Operation operation) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        Operation op=new Operation();
        op.setNom(operation.getNom());
        op.setStatus(0);
        op.setDateOperation(date);
        op.setDate(new Date());
        return  operationRepository.save(op);
    }

    @Override
    public Operation singleOperationByDate(Long id) {
        return operationRepository.getById(id);
    }
    @Override
    public Operation appellOperation() {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        int d=operationRepository.getMin(date);
        return operationRepository.rappellOperation(d,date);
    }
    @Override
    public int getMin(){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return operationRepository.getMin(date);
    }
}
