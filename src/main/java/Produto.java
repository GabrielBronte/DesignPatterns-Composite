public class Produto extends Pedido{
    private double preco;

    public Produto(String descricao, double preco) {
        super(descricao,preco);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getItem() {
        return "Produto: " + this.getDescricao() + " - Preço: " + this.preco + "\n";
    }
}