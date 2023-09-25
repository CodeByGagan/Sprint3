package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
