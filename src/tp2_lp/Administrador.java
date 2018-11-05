package tp2_lp;

import java.util.ArrayList;

public class Administrador extends Pessoa{

    public Administrador(String username, String nome, String endereco, String email, String telefone, String password, int tipo) {
        super(username, nome, endereco, email, telefone, password, tipo);
    }

    public Administrador(int id, String username, String nome, String endereco, String email, String telefone, String password, int tipo) {
        super(id, username, nome, endereco, email, telefone, password, tipo);
    }
    
}
