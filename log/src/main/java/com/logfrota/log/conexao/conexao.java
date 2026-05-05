/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logfrota.log.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class conexao {
    public static final String url = "jdbc:mysql://localhost:3328/logFrota";
    public static final String user = "root";
    public static final String senha = "";
    private static Connection conn = null;
    
    private conexao(){
    }
    
    public static synchronized Connection conectar() {
        try {
            if(conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, senha);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
