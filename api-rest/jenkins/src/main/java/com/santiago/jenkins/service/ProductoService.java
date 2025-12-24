package com.santiago.jenkins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santiago.jenkins.models.Producto;
import com.santiago.jenkins.repositories.ProductoRepository;

@Service
public class ProductoService {
    

    @Autowired
    private ProductoRepository productoRepository;

    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public List<Producto> getProductos(){
        return productoRepository.getAllProductos();
    }

    public Producto getProductoById(int id){
        return productoRepository.findById(id);
    }

    public String deleteProducto(int id){
        productoRepository.delete(id);
        return "Producto eliminado !!" + id;
    }

    public Producto updateProducto(Producto  producto){
        return productoRepository.update(producto);
    }
}
