package com.example.service;

import com.example.entities.Item;

public interface ItemServices {

	Item createItem(Item item);
	void deleteItem(Integer id);
	} 