
package com.LisandroRios.porfolioweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Lisan
 */
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreT;
    private String descripcionT;


    public Tecnologia(String nombreT1, String descripcionT1) {
    }

    public Tecnologia(String nombreT, String descripcionT, String iconoT, String nivelT) {
        this.nombreT = nombreT;
        this.descripcionT = descripcionT;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getDescripcionT() {
        return descripcionT;
    }

    public void setDescripcionT(String descripcionT) {
        this.descripcionT = descripcionT;
    }


    
    
}
