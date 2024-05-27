package com.jwt.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.example.dao.ItemRepository;
import com.jwt.example.model.Item;

@Service
public class ItemService
{
    @Autowired
	private ItemRepository itemRepository;

    public Item saveItem(Item item)
    {
    return	itemRepository.save(item);
    }
    
    public List<Item> getAllItems()
    {
    	return itemRepository.findAll();
    }
}
