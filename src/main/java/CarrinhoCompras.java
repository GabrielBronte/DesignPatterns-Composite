
public class CarrinhoCompras {

    private Pedido pedido;

    public void setItem(Pedido item) {
        this.pedido = item;
    }

    public String getItem() {
        if (this.pedido == null) {
            throw new NullPointerException("Carrinho de compras sem item");
        }
        return this.pedido.getItem();
    }

}