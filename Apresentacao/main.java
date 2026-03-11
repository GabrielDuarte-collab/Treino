package Apresentacao
public class main {
    public static void main(String[] args) {
        // Criando objetos das classes que funcionam
        Carro meuCarro = new Carro("Fusca");
        meuCarro.mostrarDetalhes();
        meuCarro.mover();

        System.out.println("-----------------------------");

        Aviao meuAviao = new Aviao("Boeing 747");
        meuAviao.mostrarDetalhes();
        meuAviao.mover();

        // ERRO PROPOSITAL PARA A APRESENTAÇÃO:
        // Veiculo v = new Veiculo(); 
        // Se descomentar a linha acima, o código não compila.
        // Erro: "Veiculo is abstract; cannot be instantiated"
    }
}
