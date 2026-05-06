/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.service;

import com.logfrota.log.DAO.ManutencaoDAO;
import com.logfrota.log.model.ManutencaoBean;
import com.logfrota.log.model.VeiculoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class ManutencaoService {
    
    @Autowired
    private ManutencaoDAO repository;
    
    public String create(ManutencaoBean manut) {
        if(manut == null){
            return "Verifique as informacoes da manutencao ";
        }
        repository.create(manut);
        return("cadastrado com sucesso");
    }

    public String delete(Integer id) {
        repository.delete(id);
        return "Deletado com sucesso";
    }
}
