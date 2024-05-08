package com.pcallserver.pcall.component.componentStorage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentStockRepository extends JpaRepository<ComponentStock, Long>{

    @Query("SELECT c.stock FROM ComponentStock c WHERE c.id = :id")
    Integer findStockById(@Param("id") Long id);

}