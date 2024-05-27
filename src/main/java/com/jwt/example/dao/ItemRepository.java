package com.jwt.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.example.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	

}
