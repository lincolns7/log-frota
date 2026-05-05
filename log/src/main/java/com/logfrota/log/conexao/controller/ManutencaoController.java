/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.conexao.controller;

import com.logfrota.log.model.ManutencaoBean;
import com.logfrota.log.model.VeiculoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Aluno
 */
public class ManutencaoController {
    
    @Autowired
    private ManutencaoController service;
    
    @PostMapping
    public String create(@RequestBody ManutencaoBean manut){
        service.create(manut);
        return "manutencao cadastrado";
    }
    
    @PutMapping("/{id}")
    public String update(@RequestBody ManutencaoBean manut){
        service.update(manut);
        return "descrição do carro atualizada com sucesso";
    }
    
    @DeleteMapping("/{id}")
    public String delete(@RequestBody Integer id){
        service.delete(id);
        return "deletado";
    }
}
