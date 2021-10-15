package com.salesianostriana.dam.E02EjerciciosPracticos;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic(optional = false)
    @Column(name = "name")
    private String nombre;
}
