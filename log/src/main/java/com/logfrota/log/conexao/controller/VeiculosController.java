/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.conexao.controller;

import com.logfrota.log.model.VeiculoBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping ("logistica/veiculos")
public class VeiculosController {
    
    @Autowired
    private VeiculosController service;
    
    @PostMapping
    public String create(@RequestBody VeiculoBean carro){
        service.create(carro);
        return "carro cadastrado";
    }
    
    @PutMapping("/{id}")
    public String update(@RequestBody VeiculoBean carro){
        service.update(carro);
        return "descrição atualizada com sucesso";
    }
    
    @DeleteMapping("/{id}")
    public String delete(@RequestBody Integer id){
        service.delete(id);
        return "deletado";
    }
}
