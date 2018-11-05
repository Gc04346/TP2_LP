package tp2_lp;

public class Orcamento {
    
    private static int genId=1;
    private int id;
    private int idCliente;
    private int idServico;
    private double preco;

    public Orcamento(int idCliente, int idServico, double preco) {
        this.id = genId;
        this.genId++;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.preco = preco;
    }

    // Getters ans Setters
    public int getIdOrcamento(){
        return this.id;
    }
    
    public int getCliente() {
        return this.idCliente;
    }

    public int getServico(){
        return this.idServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public void setIdServido(int idServico){
        this.idServico = idServico;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
