public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
    
        loja.adicionarProduto(new Produto("Camiseta", 29.90, 50));
        loja.adicionarProduto(new Produto("Calça Jeans", 99.90, 30));
        loja.adicionarProduto(new Produto("Tênis", 149.90, 20));
        loja.adicionarProduto(new Produto("Boné", 39.90, 40));
        loja.adicionarProduto(new Produto("Mochila", 79.90, 15));

        
        loja.cadastrarCliente("João Silva", "111.222.333-44");
        loja.cadastrarCliente("Maria Souza", "555.666.777-88");
        loja.cadastrarCliente("Carlos Mendes", "999.888.777-66");

        
        Venda venda1 = new Venda(loja.getCliente(0));
        venda1.adicionarItem(loja.getProduto(0), 2); 
        venda1.adicionarItem(loja.getProduto(1), 1);
        loja.registrarVenda(venda1);

        
        Venda venda2 = new Venda(loja.getCliente(1));
        venda2.adicionarItem(loja.getProduto(2), 1); 
        venda2.adicionarItem(loja.getProduto(3), 2); 
        loja.registrarVenda(venda2);

        
        Venda venda3 = new Venda(loja.getCliente(2));
        venda3.adicionarItem(loja.getProduto(4), 1); 
        venda3.adicionarItem(loja.getProduto(0), 1); 
        loja.registrarVenda(venda3);

        
        loja.imprimirRecibo();

        
        loja.imprimirResumoPorCliente();

        
        loja.imprimirEstoque();
    }
}