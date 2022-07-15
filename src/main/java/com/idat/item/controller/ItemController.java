package com.idat.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.item.entidad.Item;
import com.idat.item.servicio.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("/listar")
	public List<Item> listarItem(){
		return service.listarItem();
	}
	@GetMapping("/{id}/{cantidad}")
	public Item itemPorId(@PathVariable Integer id, @PathVariable Integer cantidad) {
		return service.itemPorId(id, cantidad);
	}

}
