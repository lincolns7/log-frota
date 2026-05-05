/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.DAO;

import com.logfrota.log.conexao.conexao;
import com.logfrota.log.model.VeiculoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class VeiculosDAO {
    public List<VeiculoBean> ler() {
        List<VeiculoBean> carro = new ArrayList();
        try {
            Connection conn = conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM veiculos");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                VeiculoBean car = new VeiculoBean();
                car.setId(rs.getInt("id"));
                car.setPlaca(rs.getString("placa"));
                car.setModelo(rs.getString("modelo"));
                carro.add(car);
            }
        } catch(SQLException e ) {
            e.printStackTrace();
        }
        return carro;
    }
    public void create(VeiculoBean carro) {
        try {
            Connection conn = conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO veiculos (placa, modelo)"
                    + "VALUES (?,?)");
            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getModelo("modelo"));
            stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(VeiculoBean equi) {
        try {
            Connection conn = conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(
                "UPDATE veiculos SET placa=?, modelo=? WHERE id=?");
            
            stmt.setString(1, equi.getPlaca());
            stmt.setString(2, equi.getModelo("modelo"));
            stmt.setInt(3, equi.getId());
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
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
