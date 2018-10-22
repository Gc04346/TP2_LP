
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Profissional extends Pessoa {
    private ArrayList<Pessoa> clientes = new ArrayList<>();
    private HashMap<Servico,Double> servicosPrestados = new HashMap<Servico,Double>();
    
    public Profissional(String username, String email, String password, int tipo) {
        super(username, email, password, tipo);
    }
    
}
