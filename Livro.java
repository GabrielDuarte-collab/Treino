public class Livro {
    String Titulo;
    String Autor;
    int anoPublicacao;

    Livro(String Titulo, String Autor, int anoPublicacao) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anoPublicacao = anoPublicacao;
    }
    String getTitulo() {
        return Titulo;
    }

    void exibir() {
        System.out.println("=== Acervo da Biblioteca ===");
        System.out.println("Titulo: " + Titulo + "Autor: " + Autor + "anoPublicacao" + anoPublicacao);

    }
}