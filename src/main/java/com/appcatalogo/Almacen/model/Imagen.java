package com.appcatalogo.Almacen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Imagen {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String imagenUrl;
    private String imagenId;

    public Imagen(String nombre, String imagenId, String imagenUrl) {
        this.nombre = nombre;
        this.imagenId = imagenId;
        this.imagenUrl = imagenUrl;
    }
}
