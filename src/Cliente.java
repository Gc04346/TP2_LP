
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
    
    public Cliente(String username, String email, String password, int tipo) {
        super(username, email, password, tipo);
    }
    
    public void pedirOrcamento(Servico s, Profissional p, double preco){
        Orcamento o = new Orcamento(p, preco, s,this);
        orcamentos.add(o);
    }
}
