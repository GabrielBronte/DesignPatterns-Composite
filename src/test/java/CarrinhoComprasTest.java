import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarrinhoComprasTest {
    @Test
    void deveRetornarItemsdoCarrinho() {
        Caixa caixa1 = new Caixa("Caixa Pequena",0.2);
        Produto produto11 = new Produto("Mouse Gamer Razer Deathadder V2 Chroma", 319.9);
        caixa1.addItem(produto11);


        Caixa caixa2 = new Caixa("Caixa Média",0.5);
        Produto produto21 = new Produto("Teclado Óptico-Mecânico Gamer Razer Huntsman Tournament",699.9);
        Produto produto22 = new Produto("Mouse Gamer Razer Viper 8Khz", 549.9);
        caixa2.addItem(produto21);
        caixa2.addItem(produto22);

        Caixa compras = new Caixa("Caixa Grande",0.7);
        compras.addItem(caixa1);
        compras.addItem(caixa2);

        CarrinhoCompras pedido = new CarrinhoCompras();
        pedido.setItem(compras);

        assertEquals("Caixa: Caixa Grande\n" +
                "Caixa: Caixa Pequena\n" +
                "Produto: Mouse Gamer Razer Deathadder V2 Chroma - Preço: 319.9\n" +
                "Caixa: Caixa Média\n" +
                "Produto: Teclado Óptico-Mecânico Gamer Razer Huntsman Tournament - Preço: 699.9\n" +
                "Produto: Mouse Gamer Razer Viper 8Khz - Preço: 549.9\n"
                , pedido.getItem());
    }

    @Test
    void deveRetornarExcecaoProjetoSemItem() {
        try {
            CarrinhoCompras shoppingcart = new CarrinhoCompras();
            shoppingcart.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Carrinho de compras sem item", e.getMessage());
        }
    }
}