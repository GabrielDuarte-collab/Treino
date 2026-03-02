import java.util.Scanner;

public class main {
 public static void main(String[] args) {
    
    Livro Livro1 = new Livro("Dom Casmurro","Machado De Assis", 1899);
    Livro Livro2 = new Livro("O cortiço","Aluisio Azevedo", 1890);
    Livro Livro3 = new Livro("Capitães da Areia"," Jorge Amado", 1937);
    Livro Livro4 = new Livro("Vidas Secas","Graciliano Ramos", 1938);

    Livro1.exibir();
    Livro2.exibir();
    Livro3.exibir();
    Livro4.exibir();
 }
}