package com.salesianostriana.dam.E02EjerciciosPracticos2;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name="name", nullable = false)
    private String nombre;

    @Column(name="price", nullable = false)
    private int precio;

    @Column(name="image")
    private String imagen;

    @Column(name="description")
    private String descripcion;

}
