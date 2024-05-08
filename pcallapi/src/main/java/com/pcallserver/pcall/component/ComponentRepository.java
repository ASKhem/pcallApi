package com.pcallserver.pcall.component;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcallserver.pcall.component.domain.Component;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long>{
    
}
