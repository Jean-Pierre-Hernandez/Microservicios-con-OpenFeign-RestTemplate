package com.idat.item.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.idat.item.entidad.Producto;

@FeignClient(name = "servicios-producto", url ="localhost:8080")
public interface ProductoFeignClient {
	
	@GetMapping("/producto/all")
	public List<Producto> listarProductos();
	
	@GetMapping("/producto/{id}")
	public Producto productoId(@PathVariable Integer id);

}
