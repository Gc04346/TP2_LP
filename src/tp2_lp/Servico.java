package tp2_lp;

import java.util.ArrayList;

class Servico {
    private static int genId=1;
    private int id;
    private int idProfissional;
    private double preco;
    private String nome;

    public Servico(int idProfissional, double preco, String nome) {
        this.id = genId++;
        this.idProfissional = idProfissional;
        this.preco = preco;
        this.nome = nome;
    }
    
    // Getters ans Setters
    public int getIdServico(){
        return id;
    }
    
    public int getProfissional() {
        return idProfissional;
    }

    public double getPreco(){
        return preco;
    }
    
    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
