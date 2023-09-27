package com.example.service;

import java.util.List;
import com.example.entities.Item;

/**
 * This interface defines the service contract for managing Item entities. It
 * declares methods for creating, retrieving, updating, and deleting items.
 */
public interface ItemServices {

	/**
	 * Creates a new item.
	 *
	 * @param item The item to be created.
	 * @return The created item.
	 */
	Item createItem(Item item);

	/**
	 * Retrieves a list of all items.
	 *
	 * @return A list of all items.
	 */
	List<Item> getAllItem();

	/**
	 * Updates an item by its ID.
	 *
	 * @param id   The ID of the item to be updated.
	 * @param item The updated item data.
	 * @return The updated item.
	 */
	Item updateItem(int id, Item item);

	/**
	 * Deletes an item by its ID.
	 *
	 * @param id The ID of the item to be deleted.
	 * @return A message indicating the success or failure of the deletion.
	 */
	String deleteItem(int id);
}
