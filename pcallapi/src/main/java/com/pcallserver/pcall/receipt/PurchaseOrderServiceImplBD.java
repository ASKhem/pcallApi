package com.pcallserver.pcall.receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import com.pcallserver.pcall.user.domain.User;
import java.util.Map;

@Service
public class PurchaseOrderServiceImplBD implements PurchaseOrderService {
    @Autowired
    PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    ModelMapper modelMapper;

    public PurchaseOrder createReceipt(PurchaseOrder purchaseOrder) {
        purchaseOrder.setDelivered(false);
        purchaseOrder.setDeliveryDate(calculateDeliveryDate(purchaseOrder.getCountry()));
        return purchaseOrderRepository.save(purchaseOrder);
    }

    private static final Map<String, Integer> DELIVERY_DAYS_BY_COUNTRY = new HashMap<>();
    static {
        String[][] countriesAndDays = {
                { "Spain", "2" }, { "Portugal", "3" }, { "France", "4" }, { "Germany", "5" },
                { "Italy", "5" }, { "UK", "6" }, { "Belgium", "4" }, { "Netherlands", "4" },
                { "Luxembourg", "4" }, { "Switzerland", "5" }, { "Austria", "5" }, { "Denmark", "5" },
                { "Sweden", "6" }, { "Norway", "6" }, { "Finland", "6" }, { "Ireland", "6" },
                { "Poland", "5" }, { "Czech Republic", "5" }, { "Slovakia", "5" }, { "Hungary", "5" },
                { "Slovenia", "5" }, { "Croatia", "5" }, { "Lithuania", "6" }, { "Latvia", "6" },
                { "Estonia", "6" }, { "Greece", "7" }, { "Bulgaria", "7" }, { "Romania", "7" },
                { "Serbia", "7" }, { "Bosnia and Herzegovina", "7" }, { "Montenegro", "7" },
                { "North Macedonia", "7" }, { "Albania", "7" }, { "Malta", "7" }, { "Cyprus", "7" }
        };

        for (String[] entry : countriesAndDays) {
            DELIVERY_DAYS_BY_COUNTRY.put(entry[0], Integer.parseInt(entry[1]));
        }
    }

    private LocalDate calculateDeliveryDate(String country) {
        int deliveryDays = DELIVERY_DAYS_BY_COUNTRY.getOrDefault(country, 7);
        return LocalDate.now().plusDays(deliveryDays);
    }

    public PurchaseOrder getReceipt(Long id) {
        return purchaseOrderRepository.findById(id).orElse(null);

    }

    public PurchaseOrder updateReceipt(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }

    public void deleteReceipt(Long id) {
        purchaseOrderRepository.deleteById(id);
    }

    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    public List<PurchaseOrder> getAllPurchaseOrdersByUser(User user) {
        return purchaseOrderRepository.findByUser(user);
    }

    public void setDelivered(Long id) {
        PurchaseOrder purchaseOrder = getReceipt(id);
        purchaseOrder.setDelivered(true);
        purchaseOrderRepository.save(purchaseOrder);
    }
}
