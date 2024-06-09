package com.pcallserver.pcall.component;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.component.domain.ComponentBrand;
import com.pcallserver.pcall.component.domain.ComponentCategory;
import com.pcallserver.pcall.component.domain.ComponentState;
import com.pcallserver.pcall.component.dto.EditComponentDto;
import com.pcallserver.pcall.component.dto.ComponentInfo;
import com.pcallserver.pcall.component.dto.NewComponentDto;
import com.pcallserver.pcall.receipt.NewOrderDto;
import com.pcallserver.pcall.receipt.Order;
import com.pcallserver.pcall.util.ComponentDtoUtils;

@Service
public class ComponentServiceImplBD implements ComponentService {

    @Autowired
    ComponentRepository componentRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Component addComponent(Component component) {
        return componentRepository.save(component);
    }

    public String generateComponentImgId(Component component) {
        String imageName = component.getModel().toLowerCase().replace(" ", "_");
        return imageName;
    }

    @Override
    public Component addComponentDto(NewComponentDto componentDto) {
        // Planteado para que se pueda agregar un componente con los valores de los
        // enums en formato String
        if (!ComponentDtoUtils.isValid(ComponentBrand.class, componentDto.getBrand()) ||
                !ComponentDtoUtils.isValid(ComponentCategory.class, componentDto.getCategory()) ||
                !ComponentDtoUtils.isValid(ComponentState.class, componentDto.getState())) {
            throw new IllegalArgumentException("Invalid enum value");
        }

        Component component = modelMapper.map(componentDto, Component.class);
        component.setBrand(ComponentDtoUtils.getEnumValue(ComponentBrand.class, componentDto.getBrand()));
        component.setCategory(ComponentDtoUtils.getEnumValue(ComponentCategory.class, componentDto.getCategory()));
        component.setState(ComponentDtoUtils.getEnumValue(ComponentState.class, componentDto.getState()));
        component.setImage(generateComponentImgId(component));

        return componentRepository.save(component);
    }

    @Override
    public List<Component> getComponents() {
        return componentRepository.findAll();
    }

    @Override
    public Component findById(Long id) {
        return componentRepository.findById(id).orElse(null);
    }

    @Override
    public Component edit(Component component) {
        return componentRepository.save(component);
    }

    @Override
    public Component simpleEdit(Long id, EditComponentDto componentEdited) {
        Component component = componentRepository.findById(id).orElse(null);
        modelMapper.map(componentEdited, component);
        return componentRepository.save(component);
    }

    @Override
    public void delete(Long id) {
        componentRepository.findById(id).ifPresent(component -> componentRepository.delete(component));
    }

    @Override
    public ComponentInfo convertToComponentDto(Long id, int stock) {
        Component component = componentRepository.findById(id).orElse(null);
        ComponentInfo componentDto = modelMapper.map(component, ComponentInfo.class);
        componentDto.setStock(stock);
        return componentDto;
    }

    @Override
    public List<Component> findByCategory(ComponentCategory category) {
        return componentRepository.findByCategory(category);
    }

    public Order convertToEntity(NewOrderDto newOrderDto) {
        Order order = new Order();
        order.setUser(newOrderDto.getUser());
        order.setPrice(newOrderDto.getPrice());
        order.setDeliveryDate(newOrderDto.getDeliveryDate());
        order.setPhone(newOrderDto.getPhone());
        order.setAddress(newOrderDto.getAddress());
        order.setCity(newOrderDto.getCity());
        order.setState(newOrderDto.getState());
        order.setZip(newOrderDto.getZip());
        order.setCountry(newOrderDto.getCountry());

        List<Component> components = componentRepository.findAllById(newOrderDto.getComponentsId());
        order.setPc(components);

        return order;
    }

}
