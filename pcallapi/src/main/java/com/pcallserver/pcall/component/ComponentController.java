package com.pcallserver.pcall.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcallserver.pcall.component.componentStorage.ComponentStock;
import com.pcallserver.pcall.component.componentStorage.ComponentStockService;
import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.component.dto.EditComponentDto;
import com.pcallserver.pcall.component.dto.NewComponentDto;


@RestController
@RequestMapping("/component")
public class ComponentController {

    @Autowired
    ComponentService componentService;

    @Autowired
    ComponentStockService stockService;

    @GetMapping("/list")
    public ResponseEntity<?> getComponentsList() {
        List<Component> components = componentService.getComponents();
        System.out.println(components);
        return ResponseEntity.ok(components);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getComponent(@PathVariable Long id){
        Component component = componentService.findById(id);
        return ResponseEntity.ok(component);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addComponent(@RequestBody NewComponentDto newComponent){
        Component component = componentService.addComponentDto(newComponent);
        stockService.createStock(new ComponentStock(component.getId(), component.getStock()));
        return ResponseEntity.status(HttpStatus.CREATED).body(component);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editComponent(@PathVariable Long id, @RequestBody EditComponentDto editComponentDto){
        Component component = componentService.simpleEdit(id, editComponentDto);
        return ResponseEntity.ok(component);
    }

    @PutMapping("stock/edit/{id}")
    public ResponseEntity<?> editStock(@PathVariable Long id, @RequestBody int quantity){
        stockService.editStock(id, quantity);
        return ResponseEntity.ok().build();
    }
    
}