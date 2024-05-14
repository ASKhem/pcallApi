package com.pcallserver.pcall.receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptServiceImplBD implements ReceiptService {
    @Autowired
    ReceiptRepository receiptRepository;

    public Receipt createReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    public Receipt getReceipt(Long id) {
        return receiptRepository.findById(id).orElse(null);
        
    }

    public Receipt updateReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    public void deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
    }
}
