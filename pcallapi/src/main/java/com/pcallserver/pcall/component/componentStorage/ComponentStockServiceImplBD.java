package com.pcallserver.pcall.component.componentStorage;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentStockServiceImplBD implements ComponentStockService{

    @Autowired
    ComponentStockRepository stockRepository;

    public ComponentStock createStock(ComponentStock componentStock){
        return stockRepository.save(componentStock);
    }
    public void deleteStock(Long componentId){
        stockRepository.deleteById(componentId);
    }

    @Override
    public int findStockById(Long componentId){
        return stockRepository.findStockById(componentId);
    }

    @Override
    public void editStock(Long componentId, int quantity){
        Optional<ComponentStock> optionalComponent = stockRepository.findById(componentId);
        if(optionalComponent.isPresent()){
            ComponentStock component = optionalComponent.get();
            component.setStock(component.getStock() + quantity);
            stockRepository.save(component);
        }
    }
}
