package com.pcallserver.pcall.component;

import java.util.List;

import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.component.domain.ComponentCategory;
import com.pcallserver.pcall.component.dto.EditComponentDto;
import com.pcallserver.pcall.component.dto.ComponentInfo;
import com.pcallserver.pcall.component.dto.NewComponentDto;
import com.pcallserver.pcall.receipt.NewOrderDto;
import com.pcallserver.pcall.receipt.PurchaseOrder;

public interface ComponentService {
    public Component addComponent(Component component);

    public Component addComponentDto(NewComponentDto componentDto);

    public Component addGenericComponentDto(NewComponentDto componentDto);

    public List<Component> getComponents();

    public Component findById(Long id);

    public Component edit(Component component);

    public Component simpleEdit(Long id, EditComponentDto componentEdited);

    public void delete(Long id);

    public ComponentInfo convertToComponentDto(Long id, int stock);

    public List<Component> findByCategory(ComponentCategory category);

    public PurchaseOrder convertToEntity(NewOrderDto newOrderDto);

}
