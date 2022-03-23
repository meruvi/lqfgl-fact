package com.laqfagal.fact.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parametro {

    @JsonProperty("codigoClasificador")
    private String codigo;
    @JsonProperty("descripcion")
    private String descripcion;

    /**
     * GETTERS AND SETTERS
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
