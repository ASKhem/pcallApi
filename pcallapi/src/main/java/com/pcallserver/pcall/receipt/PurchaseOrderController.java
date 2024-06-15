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
import com.pcallserver.pcall.user.UserService;
import com.pcallserver.pcall.user.domain.User;

import jakarta.validation.Valid;

import com.pcallserver.pcall.component.ComponentService;
import com.pcallserver.pcall.component.componentStorage.ComponentStockService;
import java.util.List;

@RestController
@RequestMapping("/admin/orders")
public class PurchaseOrderController {
    @Autowired
    public PurchaseOrderService purchaseOrderService;

    @Autowired
    public UserService userService;

    @Autowired
    public ComponentService componentService;

    @Autowired
    public ComponentStockService componentStockService;

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getReceipt(@PathVariable Long id) {
        PurchaseOrder purchaseOrder = purchaseOrderService.getReceipt(id);
        return ResponseEntity.ok(purchaseOrder);
    }

    @GetMapping("/list")
    public ResponseEntity<?> getAllOrders() {
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.getAllPurchaseOrders();
        return ResponseEntity.ok(purchaseOrders);
    }

    @PostMapping("/create")
    public ResponseEntity<?> addReceipt(@Valid @RequestBody NewOrderDto newOrderDto) {
        User user = userService.findByEmail(newOrderDto.getEmail());
        PurchaseOrder order = componentService.convertToEntity(newOrderDto);
        order.setUser(user);
        PurchaseOrder newReceipt = purchaseOrderService.createReceipt(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(newReceipt);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editReceipt(@PathVariable Long id, @RequestBody PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(id);
        PurchaseOrder updatedReceipt = purchaseOrderService.updateReceipt(purchaseOrder);
        return ResponseEntity.ok(updatedReceipt);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReceipt(@PathVariable Long id) {
        purchaseOrderService.deleteReceipt(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getByEmail/{email}")
    public ResponseEntity<?> getAllOrdersByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.getAllPurchaseOrdersByUser(user);
        return ResponseEntity.ok(purchaseOrders);
    }

    @PutMapping("/setDelivered/{id}")
    public ResponseEntity<?> setDelivered(@PathVariable Long id) {
        System.out.println("id: " + id);
        purchaseOrderService.setDelivered(id);
        return ResponseEntity.ok().build();
    }
}
