package model;


public class Login {
    private String email;
    private String senha;
    private NivelDeAcesso nivelDeAcesso;
    private boolean status;

    public Login(String email, String senha, NivelDeAcesso nivelDeAcesso, boolean status) {
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
        this.status = status;
    }

    public Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        if(senha.length()<=20){
           this.senha = senha; 
        }
        
    }

    public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public boolean isStatus() {
        return status;
    }
    
    
}
