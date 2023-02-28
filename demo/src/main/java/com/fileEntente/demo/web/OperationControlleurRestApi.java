package com.fileEntente.demo.web;

import com.fileEntente.demo.model.Operation;
import com.fileEntente.demo.services.OperationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("operation")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class OperationControlleurRestApi {
    private OperationService operationService;
    @GetMapping("/test")
    public String listOperations(){
        return "operationService.listOperation()";
    }
    @GetMapping
    public List<Operation> listOperation(){
        return operationService.listOperation();
    }
    @PostMapping
    public Operation saveOperation(@RequestBody Operation operation){
        return operationService.saveOperation(operation);
    }
    @GetMapping("appell")
    public Operation getOperation(){
        return operationService.appellOperation();
    }
}
