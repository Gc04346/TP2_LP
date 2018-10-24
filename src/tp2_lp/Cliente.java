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
public class Cliente extends Pessoa{
    private ArrayList<Orcamento> orcamentos = new ArrayList<>();
    
    public Cliente(String username, String email, String password, int tipo, ArrayList<Servico> servicos) {
        super(username, email, password, tipo, servicos);
    }
    
    public ArrayList<Profissional> consultaServico(String nome){
        for(Servico s : this.servicos){
            if(s.getNome().equals(nome) && s.isValido())
                return s.getProfissionais();
        }
        return null;
    }
    
    public void pedirOrcamento(Servico s, Profissional p, double preco){
        Orcamento o = new Orcamento(p, preco, s,this);
        orcamentos.add(o);
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(ArrayList<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }
    
}
