/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.service;

import com.logfrota.log.DAO.ManutencaoDAO;
import com.logfrota.log.DAO.VeiculosDAO;
import com.logfrota.log.model.VeiculoBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class VeiculoService {
    
    @Autowired
    private VeiculosDAO repository;
    
    public String create(VeiculoBean carro) {
        if(carro == null){
            return "Verifique se placa e modelo estao corretos";
        }
        repository.create(carro);
        return("cadastrado com sucesso");
    }
    
    public String update(VeiculoBean carro) {
        if(carro.getId() < 0){
            return "Erro";
        }
        repository.update(carro);
        return "carro atualizado com sucesso";
    }
    
    public String delete(Integer id) {
        repository.delete(id);
        return "Edeletado com sucesso";
    }
}
