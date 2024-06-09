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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pcallserver.pcall.user.UserService;
import com.pcallserver.pcall.user.domain.User;
import com.pcallserver.pcall.component.ComponentService;

@RestController
@RequestMapping("/admin/orders")
public class OrderController {
    @Autowired
    public OrderService receiptService;

    @Autowired
    public UserService userService;

    @Autowired
    public ComponentService componentService;

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getReceipt(@PathVariable Long id) {
        Order receipt = receiptService.getReceipt(id);
        return ResponseEntity.ok(receipt);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addReceipt(@RequestBody NewOrderDto newOrderDto,
            @RequestHeader("Authorization") String token) {
        User user = userService.getUserByToken(token);
        Order order = componentService.convertToEntity(newOrderDto);
        order.setUser(user);
        Order newReceipt = receiptService.createReceipt(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(newReceipt);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editReceipt(@PathVariable Long id, @RequestBody Order receipt) {
        receipt.setId(id);
        Order updatedReceipt = receiptService.updateReceipt(receipt);
        return ResponseEntity.ok(updatedReceipt);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReceipt(@PathVariable Long id) {
        receiptService.deleteReceipt(id);
        return ResponseEntity.ok().build();
    }
}
