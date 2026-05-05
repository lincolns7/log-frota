/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.DAO;

import com.logfrota.log.conexao.conexao;
import com.logfrota.log.model.ManutencaoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ManutencaoDAO {
    public void create(ManutencaoBean equi) {
        try {
            Connection conn = conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO manutencao (valor, decricao)"
                    + "VALUES (?,?)");
            stmt.setDouble(1, equi.getValor());
            stmt.setString(2, equi.getDescricao());
            
            stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try {
            Connection conn = conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM veiculos WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
