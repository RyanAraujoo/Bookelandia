/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import dal.ClienteDAO;
import model.Cliente;
import model.Login;
import model.NivelDeAcesso;
import view.FrmCliente;
import java.sql.SQLException;
/**
 *
 * @author mylla
 */
public class ControllerCadClientes {
    private FrmCliente view;
    
     public void ControllerCadClientes(FrmCliente view) {
         this.view = view;
     }
    public void cadastrarCliente() throws SQLException {
       Cliente cliente = new Cliente();
       cliente.setNome(view.getTxtNome().getText());
       cliente.setCpf(view.getTxtCpf().getText());
       cliente.setTelefone(view.getTxtTelefone().getText());
       cliente.setEndereco(view.getTxtEndereco().getText());
       
       ClienteDAO clienteDao = new ClienteDAO();
       clienteDao.adiciona(cliente);
       
       Login lg = new Login();
      lg.setEmail(view.getTxtEmail().getText());
      lg.setSenha(view.getTxtSenha().getPassword().toString());
      lg.setNivelDeAcesso(NivelDeAcesso.Cliente);
      lg.setStatus(true);
    }

    public void limparTela() {
        view.getTxtNome().setText("");
        view.getTxtEmail().setText("");
        view.getTxtEndereco().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtSenha().setText("");
        view.getTxtCpf().setText("");
    }
   public void consultaCliente() throws SQLException {        
        String cpf = view.getTxtCpf().getText();
    
    ClienteDAO clienteDao = new ClienteDAO();
    Cliente cliente = clienteDao.recupera(cpf);
    
    if (cliente != null) {
        view.getTxtNome().setText(cliente.getNome());
        view.getTxtEndereco().setText(cliente.getEndereco());
        view.getTxtTelefone().setText(cliente.getTelefone());
        }
    }
}