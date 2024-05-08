package com.pcallserver.pcall.component;

import java.util.List;

import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.component.dto.EditComponentDto;
import com.pcallserver.pcall.component.dto.ComponentInfo;
import com.pcallserver.pcall.component.dto.NewComponentDto;

public interface ComponentService {
    public Component addComponent(Component component);
    public Component addComponentDto(NewComponentDto componentDto);
    public List<Component> getComponents();
    public Component findById(Long id);
    public Component edit(Component component);
    public Component simpleEdit(Long id, EditComponentDto componentEdited);
    public void delete(Long id);
    public ComponentInfo convertToComponentDto(Long id, int stock);
} 
 