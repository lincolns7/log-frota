/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.conexao.controller;

import com.logfrota.log.model.ManutencaoBean;
import com.logfrota.log.model.VeiculoBean;
import com.logfrota.log.service.ManutencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logistica/mautencao")
public class ManutencaoController {
    
    @Autowired
    private ManutencaoService service;
    
    @PostMapping
    public String create(@RequestBody ManutencaoBean manut){
        service.create(manut);
        return "manutencao cadastrado";
    }
    
    @DeleteMapping("/{id}")
    public String delete(@RequestBody Integer id){
        service.delete(id);
        return "deletado";
    }
}
