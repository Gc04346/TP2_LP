package tp2_lp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Orcamento {
    private Pessoa Profissional;
    private double preco;
    private Servico servico;
    private Pessoa cliente;

    public Orcamento(Pessoa Profissional, double preco, Servico servico, Pessoa cliente) {
        this.Profissional = Profissional;
        this.preco = preco;
        this.servico = servico;
        this.cliente=cliente;
    }

    public Pessoa getProfissional() {
        return Profissional;
    }

    public void setProfissional(Pessoa Profissional) {
        this.Profissional = Profissional;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
