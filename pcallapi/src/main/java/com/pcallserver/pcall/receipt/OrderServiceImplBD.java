package com.pcallserver.pcall.receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class OrderServiceImplBD implements OrderService {
    @Autowired
    OrderRepository receiptRepository;

    @Autowired
    ModelMapper modelMapper;

    public Order createReceipt(Order receipt) {
        return receiptRepository.save(receipt);
    }

    public Order getReceipt(Long id) {
        return receiptRepository.findById(id).orElse(null);
        
    }

    public Order updateReceipt(Order receipt) {
        return receiptRepository.save(receipt);
    }

    public void deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
    }
}
