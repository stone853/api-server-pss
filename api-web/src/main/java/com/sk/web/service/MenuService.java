package com.sk.web.service;


import com.sk.model.ResultListModel;
import com.sk.web.model.Menu;
import com.sk.web.model.MenuExample;



public interface MenuService extends BaseService<Menu, MenuExample>{

    ResultListModel<Menu> findAll();


    public ResultListModel queryMenusById(String userId);
}

