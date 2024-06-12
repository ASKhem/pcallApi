package com.pcallserver.pcall.receipt;

import com.pcallserver.pcall.user.domain.User;

import java.util.List;

public interface PurchaseOrderService {
    public PurchaseOrder createReceipt(PurchaseOrder receipt);

    public PurchaseOrder getReceipt(Long id);

    public PurchaseOrder updateReceipt(PurchaseOrder receipt);

    public void deleteReceipt(Long id);

    public List<PurchaseOrder> getAllPurchaseOrders();

    public List<PurchaseOrder> getAllPurchaseOrdersByUser(User user);

    public void setDelivered(Long id);
}
