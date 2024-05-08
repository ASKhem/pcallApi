package com.pcallserver.pcall.component.componentStorage;


public interface ComponentStockService {
    public ComponentStock createStock(ComponentStock componentStock);
    public void deleteStock(Long componentId);
    public int findStockById(Long componentId);
    public void editStock(Long componentId, int quantity);
}
