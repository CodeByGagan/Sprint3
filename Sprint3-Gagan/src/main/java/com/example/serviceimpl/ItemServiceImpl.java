package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Item;
import com.example.repository.ItemRepo;
import com.example.service.ItemServices;

@Service
public class ItemServiceImpl implements ItemServices {

	@Autowired
	ItemRepo itemRepo;

	/**
	 * Creates a new item.
	 *
	 * @param item The item to be created.
	 * @return The created item.
	 */
	@Override
	public Item createItem(Item item) {
		return itemRepo.save(item);
	}

	/**
	 * Retrieves a list of all items.
	 *
	 * @return A list of all items.
	 */
	@Override
	public List<Item> getAllItem() {
		return itemRepo.findAll();
	}

	/**
	 * Updates an item by its ID.
	 *
	 * @param id   The ID of the item to be updated.
	 * @param item The updated item data.
	 * @return The updated item.
	 */
	@Override
	public Item updateItem(int id, Item item) {
		Item i = itemRepo.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		Item updatedItem = itemRepo.save(i);
		return updatedItem;
	}

	/**
	 * Deletes an item by its ID.
	 *
	 * @param id The ID of the item to be deleted.
	 * @return A message indicating the success or failure of the deletion.
	 */
	@Override
	public String deleteItem(int id) {
		itemRepo.deleteById(id);
		return "Item deleted successfully.";
	}

//	@Override
//	public void deleteItem(int id) {
//		Optional<Item> item = itemRepo.findById(id);
//		itemRepo.deleteById(id);
//	}

}
