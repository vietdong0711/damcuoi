package com.example.damcuoi.service.impl;

import com.example.damcuoi.entity.Menu;
import com.example.damcuoi.repository.IMenuRepository;
import com.example.damcuoi.request.MenuRequest;
import com.example.damcuoi.response.MenuResponse;
import com.example.damcuoi.service.IMenuService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private IMenuRepository menuRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createMenu(MenuRequest request) {
        Menu menu = new Menu(request);
        menuRepository.save(menu);
    }

    @Override
    public List<MenuResponse> getMenus() {
        List<Menu> menus = menuRepository.findAll();
        List<MenuResponse> responses = modelMapper.map(menus, new TypeToken<List<MenuResponse>>() {
        }.getType());
        return responses;
    }
}
