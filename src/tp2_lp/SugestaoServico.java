package tp2_lp;

public class SugestaoServico {
    
    private String nome;
    private boolean valido;
    
    public SugestaoServico(String nome){
        this.nome = nome;
        this.valido = false;
    }

    public SugestaoServico(String nome, boolean valido) {
        this.nome = nome;
        this.valido = valido;
    }
    
    public boolean isValid(){
        return this.valido;
    }
    
    // Getters and Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValidade(boolean valido){
        this.valido = valido;
    }
}
