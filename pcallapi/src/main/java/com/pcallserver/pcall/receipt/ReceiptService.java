package com.pcallserver.pcall.receipt;


public interface ReceiptService {
    public Receipt createReceipt(Receipt receipt);
    public Receipt getReceipt(Long id);
    public Receipt updateReceipt(Receipt receipt);
    public void deleteReceipt(Long id);
}
