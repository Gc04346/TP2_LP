/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public abstract class Pessoa {
    protected String username;
    protected String email;
    protected String password;
    private int tipo; // 1 - adm, 2 - profissional, 3 - cliente

    public Pessoa(String username, String email, String password, int tipo) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Pessoa() {
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
