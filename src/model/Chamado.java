package model;


public class Chamado {
    private int  ticket;
    private boolean status;
    private Funcionario codigoDoFuncionario;
    private Cliente codigoDoCliente;
    private Pedido codigoDoPedido;
    private String descricao;

    public Chamado() {
    }

    public Chamado(int ticket) {
        this.ticket = ticket;
    }

    public Chamado(int ticket, Funcionario codigoDoFuncionario, Cliente codigoDoCliente, Pedido codigoDoPedido) {
        this.ticket = ticket;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.codigoDoCliente = codigoDoCliente;
        this.codigoDoPedido = codigoDoPedido;
    }

    /**
     * @return the ticket
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the codigoDoFuncionario
     */
    public Funcionario getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    /**
     * @param codigoDoFuncionario the codigoDoFuncionario to set
     */
    public void setCodigoDoFuncionario(Funcionario codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    /**
     * @return the codigoDoCliente
     */
    public Cliente getCodigoDoCliente() {
        return codigoDoCliente;
    }

    /**
     * @param codigoDoCliente the codigoDoCliente to set
     */
    public void setCodigoDoCliente(Cliente codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    /**
     * @return the codigoDoPedido
     */
    public Pedido getCodigoDoPedido() {
        return codigoDoPedido;
    }

    /**
     * @param codigoDoPedido the codigoDoPedido to set
     */
    public void setCodigoDoPedido(Pedido codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
    
}
