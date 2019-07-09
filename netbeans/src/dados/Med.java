package dados;

import gui.Cad_Med;




public class Med {
    
    
    private int codigo;
    private String nome;
    private int quantidade;
    private double valor;

    
    
   public Med() {
        this.codigo = 0;
        this.nome = "";
        this.quantidade = 0;
        this.valor = 0.0;
    } 
   
    
    
    public int getCodigo() {
        return codigo;
    }
    
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
     public String getNome() {
        return nome;
    }
    
   public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
    
    
     public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    
}

 
