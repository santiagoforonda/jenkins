package com.santiago.jenkins.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Integer id;
    private String nombre;
    private Integer cantidad;
    private Double precio;
}
