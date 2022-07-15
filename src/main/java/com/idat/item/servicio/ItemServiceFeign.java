package com.idat.item.servicio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.idat.item.cliente.ProductoFeignClient;
import com.idat.item.entidad.Item;

@Service
@Primary
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private ProductoFeignClient clienteFeign;

	@Override
	public List<Item> listarItem() {
		// TODO Auto-generated method stub
		return clienteFeign.listarProductos().stream().map(p-> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item itemPorId(Integer idItem, Integer cantidad) {
		return new Item(clienteFeign.productoId(idItem),cantidad);
	}

}
