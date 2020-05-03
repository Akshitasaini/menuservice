package com.spicy.kitchen.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spicy.kitchen.dao.MenuDao;
import com.spicy.kitchen.model.Menu;

@Service

public class MenuServiceImp implements MenuService {
	@Autowired
	private MenuDao menuDao;


	@Override
	public Menu createItem(Menu menu) {
		
		return menuDao.save(menu);
	}

	@Override
	
	public Iterable<Menu> getMenu() {
		// TODO Auto-generated method stub
		return menuDao.findAll();
	}
	

	@Override
	public Menu findItemById(Integer id) {
		// TODO Auto-generated method stub
		return menuDao.findById(id).get();
	}

	@Override
	public Menu updateItemById(Integer id, Menu menu) {
		return menuDao.save(menu);

	}

	@Override
	public void deleteItemById(Integer id) {
		menuDao.deleteById(id);

	}
}
