package tp2_lp;


import java.util.ArrayList;
import java.util.HashMap;

public class Profissional extends Pessoa {
    // private ArrayList<Pessoa> clientes = new ArrayList<>();
    // se esse hashmap nao funcionar, tentar com string ao inves de Servico
    // private HashMap<Servico,Double> servicosPrestados;
    
    public Profissional(String username, String email, String password, int tipo) {
        super(username, email, password, tipo);
        // this.servicosPrestados = new HashMap<>();
    }
    
    //public boolean addServicoPrestado(String nome, double valor){
    //    for(Servico s : this.servicos){
    //        if(s.getNome().equals(nome) && s.isValido()){
    //            Double put = servicosPrestados.put(s,valor);
    //            s.addProfissionais(this);
    //            return true;
    //        }
    //    }
    //    return false;
    //}
    
    //public boolean alteraPreco(String nome, double valor){
    //    for(Servico s : this.servicos){
    //        if(s.getNome().equals(nome)){
    //            Double put = servicosPrestados.put(s,valor);
    //            return true;
    //        }
    //    }
    //    return false;
    //}
}
