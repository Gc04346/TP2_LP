package tp2_lp;

public class Profissional extends Pessoa {

    public Profissional(String username, String nome, String endereco, String email, String telefone, String password, int tipo) {
        super(username, nome, endereco, email, telefone, password, tipo);
    }

    public Profissional(int id, String username, String nome, String endereco, String email, String telefone, String password, int tipo) {
        super(id, username, nome, endereco, email, telefone, password, tipo);
    }
}
