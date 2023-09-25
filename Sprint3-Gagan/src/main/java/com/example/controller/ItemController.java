package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Item;
import com.example.repository.ItemRepo;
import com.example.service.ItemServices;

@RestController
public class ItemController {

	@Autowired
	private ItemServices itemServices;
	
	final ItemRepo itemRepo;

	@PostMapping("/postitem")
	public Item createItem(@RequestBody Item item) {
		return itemServices.createItem(item);
	}
	
	public ItemController(@Autowired ItemRepo itemRepo )
    {
        this.itemRepo = itemRepo;
    }

    @GetMapping("/getitem")
    public Iterable<Item> getItems(){
        return itemRepo.findAll();
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteItem(@PathVariable("id") Integer itemId){
    	itemServices.deleteItem(itemId);
    	return ResponseEntity.ok("Item Todo deleted successfully!.");
    }
    
    @PutMapping("{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Integer id, @RequestBody Item itemDetails){
    	Item updateItem = itemRepo.findById(id).orElseThrow();
    	
    	updateItem.setName(itemDetails.getName());
    	updateItem.setDescription(itemDetails.getDescription());
    	updateItem.setPrice(itemDetails.getPrice());
    	
    	itemRepo.save(updateItem);
    	
		return ResponseEntity.ok(updateItem);
    	 
    }
    
}
 