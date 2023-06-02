package com.example.damcuoi.service;

import com.example.damcuoi.request.MenuRequest;
import com.example.damcuoi.response.MenuResponse;

import java.util.List;

public interface IMenuService {
    void createMenu(MenuRequest request);

    List<MenuResponse> getMenus();
}
