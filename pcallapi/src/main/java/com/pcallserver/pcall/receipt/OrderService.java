package com.pcallserver.pcall.receipt;


public interface OrderService {
    public Order createReceipt(Order receipt);
    public Order getReceipt(Long id);
    public Order updateReceipt(Order receipt);
    public void deleteReceipt(Long id);
}
