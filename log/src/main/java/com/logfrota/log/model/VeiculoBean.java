/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.model;

/**
 *
 * @author Aluno
 */
public class VeiculoBean {
    private int id;
    private String placa;
    private String modelo;

    public VeiculoBean() {
    }

    public VeiculoBean(int id, String placa, String modelo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo(String modelo) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
