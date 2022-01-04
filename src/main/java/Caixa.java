import java.util.ArrayList;
import java.util.List;

public class Caixa extends Pedido{

    private List<Pedido> itens;

    public Caixa(String descricao, double preco) {
        super(descricao,preco);
        this.itens = new ArrayList<Pedido>();
    }

    public void addItem(Pedido conteudo) {
        this.itens.add(conteudo);
    }

    public String getItem() {
        String saida = "";
        saida = "Caixa: " + this.getDescricao() + "\n";
        for (Pedido item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}