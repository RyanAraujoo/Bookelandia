/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mylla
 */
public class Conexao {
    private Connection conexao;
    
    public Connection getConexao() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "terra0102");
        return conexao;
    }
    public void fecha() throws SQLException {
        if (conexao != null) {
        conexao.close();
    }
    }
}
