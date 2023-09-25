package com.example.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Item;
import com.example.repository.ItemRepo;
import com.example.service.ItemServices;

@Service
public class ItemServiceImpl implements ItemServices{

	@Autowired
	ItemRepo itemRepo;
	
	@Override
	public Item createItem(Item item) {
		return itemRepo.save(item);
	}

	@Override
	public void deleteItem(Integer id) {
		Optional<Item> item = itemRepo.findById(id);
		itemRepo.deleteById(id);
	}
	
	
}
