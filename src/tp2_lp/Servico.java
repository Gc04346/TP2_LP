package tp2_lp;


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
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private boolean valido;
    private String nome;

    public Servico(String nome) {
        this.nome = nome;
        this.valido = false;
    }

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public void addProfissionais(Profissional e) {
        profissionais.add(e);
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
