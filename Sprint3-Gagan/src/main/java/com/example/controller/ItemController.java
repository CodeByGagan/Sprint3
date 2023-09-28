package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Item;
import com.example.service.ItemServices;

@RestController
public class ItemController {

	@Autowired
	private ItemServices itemServices;

	/**
	 * POST method to create a new item.
	 *
	 * @param item The item to be created, provided in the request body.
	 * @return The created item.
	 */
	@PostMapping("/postitem")
	public Item createItem(@RequestBody Item item) {
		return itemServices.createItem(item);
	}

	/**
	 * GET method to retrieve all items.
	 *
	 * @return A list of all items.
	 */
	@GetMapping("/getitem")
	List<Item> getAItems() {
		return itemServices.getAllItem();
	}

	/**
	 * PUT method to update an item by its ID.
	 *
	 * @param id The ID of the item to be updated.
	 * @param i  The updated item data, provided in the request body.
	 * @return The updated item.
	 */
	@PutMapping("/updateitem/{id}")
	Item updateItem(@PathVariable int id, @RequestBody Item i) {
		return itemServices.updateItem(id, i);
	}

	/**
	 * DELETE method to delete an item by its ID.
	 *
	 * @param id The ID of the item to be deleted.
	 * @return A message indicating the success or failure of the deletion.
	 */
	@DeleteMapping("/deleteitem/{id}")
	public String deleteItem(@PathVariable int id) {
		return itemServices.deleteItem(id);
	}

}
