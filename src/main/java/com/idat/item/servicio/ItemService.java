package com.idat.item.servicio;

import java.util.List;

import com.idat.item.entidad.Item;

public interface ItemService {
	
	List<Item>listarItem();
	Item itemPorId(Integer idItem, Integer cantidad);

}
