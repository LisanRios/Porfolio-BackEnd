package com.LisandroRios.porfolioweb.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoTecnologia {

    @NotBlank
    private String nombreT;
    @NotBlank
    private String descripcionT;


    public dtoTecnologia() {
    }

    public dtoTecnologia(String nombreT, String descripcionT, String iconoT, String nivelT) {
        this.nombreT = nombreT;
        this.descripcionT = descripcionT;

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
