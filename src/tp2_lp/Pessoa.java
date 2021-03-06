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
public class Pessoa {
    protected String username;
    protected String email;
    protected String password;
    protected int tipo; // 1 - adm, 2 - profissional, 3 - cliente
    protected ArrayList<Servico> servicos = new ArrayList<>();

    public Pessoa(String username, String email, String password, int tipo, ArrayList<Servico> servicos) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
        this.servicos = servicos;
    }
    
    public Pessoa(){
        
    }
    
    public void cadastraServico(String nome){
        Servico s = new Servico(nome);
        servicos.add(s);
    }
    
    public boolean alterarNome(String novoNome, String senha){
        if(senha.equals(this.password)){
            setUsername(novoNome);
            return true;
        }
        return false;
    }
    
    public boolean alterarEmail(String novoEmail, String senha){
        if(senha.equals(this.password)){
            setEmail(novoEmail);
            return true;
        }
        return false;
    }
    
    public boolean alterarSenha(String novaSenha, String senha){
        if(senha.equals(this.password)){
            setPassword(novaSenha);
            return true;
        }
        return false;
    }
    
    public Cliente cadastraCliente(String username, String email, String password, int tipo, ArrayList<Servico> servicos){
        return new Cliente (username, email, password, 2, servicos);
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
 
}
