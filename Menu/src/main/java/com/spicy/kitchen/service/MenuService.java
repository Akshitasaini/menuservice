package com.spicy.kitchen.service;


import com.spicy.kitchen.model.Menu;

public interface MenuService {
	public Menu createItem(Menu menu);
    public Iterable<Menu> getMenu();
    public Menu findItemById(Integer id); 
    public Menu updateItemById(Integer id,Menu menu);
    public void deleteItemById(Integer id);
}
