package model;

import java.time.LocalDate;

public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected LocalDate dataDeAdmissao;
    protected String cargo;
    protected double salario;
    protected Chamado chamado;

    protected Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(int matricula, String nome, Chamado chamado) {
        this.matricula = matricula;
        this.nome = nome;
        this.chamado = chamado;
    }
    
    protected Funcionario(int matricula, String nome, LocalDate dataDeAdmissao, String cargo, double salario, Chamado chamado) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.cargo = cargo;
        this.salario = salario;
        this.chamado = chamado;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public Chamado getChamado() {
        return chamado;
    }
     
    
    public String getCargo() {
        return cargo;
    }
     
}
