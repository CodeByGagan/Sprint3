package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Item;

/**
 * This interface defines a Spring Data JPA repository for the Item entity. It
 * extends JpaRepository to provide CRUD (Create, Read, Update, Delete)
 * operations for the Item entity with Integer as the type of the primary key.
 */
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
