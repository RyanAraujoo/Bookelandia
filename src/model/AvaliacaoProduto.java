package model;

public class AvaliacaoProduto {
    private int codigoDoProduto;
    private Cliente codigoDoCliente;
    private Nota nota;
    private String descricao;

    public AvaliacaoProduto() {
    }

    public AvaliacaoProduto(int codigoDoProduto, Cliente codigoDoCliente) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
    }

    public AvaliacaoProduto(int codigoDoProduto, Cliente codigoDoCliente, Nota nota) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
    }

    /**
     * @return the codigoDoProduto
     */
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * @param codigoDoProduto the codigoDoProduto to set
     */
    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
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

    /**
     * @return the nota
     */
    public Nota getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Nota nota) {
        this.nota = nota;
    }
    
    
}
