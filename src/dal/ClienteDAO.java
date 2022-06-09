/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import java.sql.Date;

/**
 *
 * @author mylla
 */
public class ClienteDAO implements ICrud<Cliente> {

    private Conexao conexao;

    public ClienteDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public void adiciona(Cliente t) throws SQLException {
        String sql = "insert into clientes (cpf, nome telefone,endereco,dataDeCadastro) values ?";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getTelefone());
        ps.setString(4, t.getEndereco());
        ps.setDate(5,Date.valueOf(t.getDataDeCadastro()));
        ps.execute();
        conexao.fecha();
        
    }   
    @Override
    public Cliente recupera(String id) throws SQLException {
        String sql = "select cpf,nome,endereco,telefone from Clientes where cpf = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1,id);
        ps.execute();
        ResultSet resultado = ps.getResultSet();
        conexao.fecha();
        
        Cliente c = new Cliente();
        c.setCpf("cpf");
        c.setNome("nome");
        c.setEndereco("endereco");
        c.setTelefone("telefone");
        //c.setDataDeCadastro("dataDeCadastro");
        
        
        return c;
                
    }

    @Override
    public void exclui(Cliente t) throws SQLException {
    String sql = "delete from Cliente where cpf, nome, endereco, telefone, dataDeCadastro = ?;";
    PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
     ps.setString(1, t.getCpf());
     ps.setString(2, t.getNome());
     ps.setString(3, t.getTelefone());
     ps.setString(4, t.getEndereco());
     ps.setDate(5,Date.valueOf(t.getDataDeCadastro()));
     ps.execute();
     conexao.fecha();
    
    }

    @Override
    public void altera(Cliente t) throws SQLException {
     String sql =  "update Cliente set cpf = ?, nome = ?, endereco = ?, telefone = ?, dataDeCadastro = ?;";
     PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
     ps.setString(1, t.getCpf());
     ps.setString(2, t.getNome());
     ps.setString(3, t.getTelefone());
     ps.setString(4, t.getEndereco());
     ps.setDate(5,Date.valueOf(t.getDataDeCadastro()));
     ps.execute();
     conexao.fecha();
    }
}
