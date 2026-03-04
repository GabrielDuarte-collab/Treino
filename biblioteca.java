import java.util.*;

public class biblioteca {

    ArrayList<Livro> acervo;

    biblioteca() {
        this.acervo = new ArrayList();
    }

    // Adionar Livro na Biblioteca
    void adicionar(Livro Livro) {
        acervo.add(Livro);
    }

    // Listar os Livros da Biblioteca
    void Listar() {
        System.out.println("=== Acervo de Biblioteca ===");
        for (Livro LivroPecorreNesteIstante : acervo) {
            LivroPecorreNesteIstante.exibir();
        }
    }

    // Buscar os Livros da Biblioteca
    void buscar(String Titulo) {
        System.out.println("== Buscar ==");
        boolean encontrando = false;
        for (Livro Livro : acervo) {
            if (Livro.getTitulo().equalsIgnoreCase(Titulo)) {
                Livro.exibir();
                encontrando = true;
                break;

            }
        }
    }
}
