package tp2_lp;


import java.util.ArrayList;

public class Pessoa {
    protected static int genId = 1;
    protected int id;
    protected String username;
    protected String nome;
    protected String endereco;
    protected String email;
    protected String telefone;
    protected String password;
    protected int tipo;

    public Pessoa(String username, String nome, String endereco, String email, String telefone, String password, int tipo) {
        this.id = genId; // Definicao do ID.
        this.genId++; // Gerador de ID recebe um incremento.
        this.username = username;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.password = password;
        this.tipo = tipo;
       
    }
    
    public Pessoa(){
        
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
