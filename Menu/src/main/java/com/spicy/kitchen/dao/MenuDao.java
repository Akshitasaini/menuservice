package com.spicy.kitchen.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spicy.kitchen.model.Menu;
@Repository
public interface MenuDao extends CrudRepository<Menu, Integer> {
	
}
