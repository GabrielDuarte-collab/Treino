public class Livro {
    String Titulo;
    String Autor;
    0int anoPublicacao

    Livro(String Titulo, String Autor, int anoPublicacao) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anoPublicacao = anoPublicacao;
    }

    void exibir(){
        System.out.println("=== Acervo da Biblioteca ===")
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("anoPublicacao: " + anoPublicacao);
    }

}