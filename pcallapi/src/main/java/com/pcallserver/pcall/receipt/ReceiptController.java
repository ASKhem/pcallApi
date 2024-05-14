package com.pcallserver.pcall.receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/receipt")
public class ReceiptController {
    @Autowired
    public ReceiptService receiptService;

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getReceipt(@PathVariable Long id){
        Receipt receipt = receiptService.getReceipt(id);
        return ResponseEntity.ok(receipt);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addReceipt(@RequestBody Receipt receipt){
        Receipt newReceipt = receiptService.createReceipt(receipt);
        return ResponseEntity.status(HttpStatus.CREATED).body(newReceipt);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editReceipt(@PathVariable Long id, @RequestBody Receipt receipt){
        receipt.setId(id);
        Receipt updatedReceipt = receiptService.updateReceipt(receipt);
        return ResponseEntity.ok(updatedReceipt);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReceipt(@PathVariable Long id){
        receiptService.deleteReceipt(id);
        return ResponseEntity.ok().build();
    }
}
    
    
