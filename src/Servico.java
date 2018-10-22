
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
class Servico {
    private ArrayList<Pessoa> profissionais = new ArrayList<>();
    private boolean valido;
    private String nome;
    private double valor;

    public Servico(String nome) {
        this.nome = nome;
        this.valido = false;
    }

    public ArrayList<Pessoa> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(ArrayList<Pessoa> profissionais) {
        this.profissionais = profissionais;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
