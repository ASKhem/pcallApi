package com.pcallserver.pcall.component;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.component.domain.ComponentCategory;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long>{
    public List<Component> findByCategory(ComponentCategory category);
}
