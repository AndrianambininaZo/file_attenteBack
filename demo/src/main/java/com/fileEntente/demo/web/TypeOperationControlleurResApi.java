package com.fileEntente.demo.web;

import com.fileEntente.demo.model.TypeOperation;
import com.fileEntente.demo.services.TypeOperationServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("typeOperation")
@AllArgsConstructor
public class TypeOperationControlleurResApi {
    private TypeOperationServices operationServices;
    @GetMapping
    public List<TypeOperation> listType(){
        return operationServices.listTypeOperation();
    }
    @PostMapping
    public TypeOperation saveType(@RequestBody TypeOperation typeOperation){
        return operationServices.saveType(typeOperation);
    }

}
