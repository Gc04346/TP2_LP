package tp2_lp;

public class Orcamento {
    
    private static int genId=1;
    private int id;
    private int idCliente;
    private int idServico;
    private double preco;
    // Variável que indica se o orçamento foi aceito pelo profissional.
    private boolean aceito;
    // Status do pedido sendo, 1- pendente, 2- parcialmente concluído e 3- totalmente concluído.
    private int status; 

    public Orcamento(int idCliente, int idServico, double preco, boolean aceito, int status) {
        this.id = genId;
        this.genId++;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.preco = preco;
        this.aceito = aceito;
        this.status = status;
    }

    public Orcamento(int id, int idCliente, int idServico, double preco, boolean aceito, int status) {
        this.genId++;
        this.id = id;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.preco = preco;
        this.aceito = aceito;
        this.status = status;
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
    
    public boolean getAceito(){
        return aceito;
    }
    
    public int getStatus(){
        return status;
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
    
    public void setAceito(boolean aceito){
        this.aceito = aceito;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
}
