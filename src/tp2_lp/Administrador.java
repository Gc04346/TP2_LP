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
public class Administrador extends Pessoa{
    
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Administrador(String username, String email, String password, int tipo, 
            ArrayList<Pessoa> pessoas, ArrayList<Servico> servicos) {
        super(username, email, password, tipo, servicos);
        this.pessoas = pessoas;
    }
    
    public Administrador cadastraNovoAdm(String username, String email, String password, int tipo, 
            ArrayList<Pessoa> pessoas, ArrayList<Servico> servicos){
        return new Administrador(username, email, password, tipo, pessoas, servicos);
    }
    
    public void validarServico(String nome){
        for(Servico s : this.servicos){
            if(s.getNome().equals(nome))
                s.setValido(true);
        }
    }
     
    public boolean excluiPessoa(String username){
        for (Pessoa o : pessoas){
            if (o.getUsername().equals(username)){
                pessoas.remove(o);
                return true;
            }
        }        
        return false;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
}
