package com.pcallserver.pcall.receipt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.pcallserver.pcall.user.domain.User;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    @Query("SELECT po FROM PurchaseOrder po WHERE po.user = :user")
    List<PurchaseOrder> findByUser(@Param("user") User user);
}
