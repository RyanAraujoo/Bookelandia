/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dal;
import java.sql.SQLException;
/**
 *
 * @author mylla
 */
public interface ICrud<T> {
    void adiciona(T t) throws SQLException;
        
    
     T recupera(int id) throws SQLException; 
        
    
     void exclui(T t) throws SQLException;
        
    
    void altera(T t) throws SQLException;
        
}
