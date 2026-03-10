public class Venda {

    Cliente cliente;
    Produto[] produtos = new produto[10];
    int[] quantidades = new int[10];
    int totalItens = 0;

    public venda(Cliente cliente) {
        this.cliente = cliente;

    }

    public void addProduto(Produto produto, int quantidade) {

        if (produto.estoque < quantidade) {
            System.out.println("Estoque insuficiente para: " + produto.nome);
            return;
        }
        produto[TotalItens] = produtos;
        quantidades[TotalItens] = quantidade;
        TotalItens++;

        produto.estoque -= quantidade;

    }

    double calcularTotal() {
        double total = 0;

        for (int i = 0; i < totalItens; i++) {
            total += Produtos[i].preco
                    * quantidades[i];
        }
        return total;
    }

    void imprimirRecibo(int numero) {
        System.out.println("\n====== RECIBO VENDA #" + (numero) + " ======");
        System.out.println("Cliente : " + Cliente.nome + " CPF: " + Cliente.Cpf);
        System.out.println("Itens:");

        double totalRecibo = 0;

        for (int i = 0; i < totalItens; i++) {

            double subTotal = produtos[i].preco * quantidades[i];
            total += sub;

            System.out.printf(
                    " - %-14s x%d R$ %.2f%n",
                    produtos[i].nome,
                    quantidades[i],
                    sub);
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);
    }
}
