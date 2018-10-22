
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
public class Sistema {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();
    
    public boolean criaNovaPessoa(int tipo, String username, String senha, String email){
        switch(tipo){
            case 1: Pessoa a = new Administrador(username,email,senha,tipo);
                    pessoas.add(a);
                    return true;
            case 2: Pessoa p = new Profissional(username,email,senha,tipo);
                    pessoas.add(p);
                    return true;
            case 3: Pessoa c = new Cliente(username,email,senha,tipo);
                    pessoas.add(c);
                    return true;
            default: return false;
        }
    }
    
    public boolean excluiPessoa(String username, int tipo){
        if(tipo == 1){
            for (Pessoa o : pessoas){
                if (o.getUsername().equals(username)){
                    pessoas.remove(o);
                    return true;
                }
            }
        }        
        return false;
    }
    
    public void cadastraServico(String nome){
        Servico s = new Servico(nome);
        servicos.add(s);
    }
    
    public void validarServico(String nome, int tipo){
        if(tipo==1){
            for(Servico s : servicos){
                if(s.getNome().equals(nome))
                    s.setValido(true);
            }
        }
    }
    
    public ArrayList listaServicos(){
        return servicos;
    }
    
    public ArrayList consultaServico(String nome){
        for(Servico s : servicos){
            if(s.getNome().equals(nome)){
                return s.getProfissionais();
            }
        }
        return null;
    }
}
