package aula3oo.arrays;

class Livro {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
}
//Exemplo debug
public class ExemploArrayObjetos2 {
    public static void main(String[] args) {
        Livro[] livros = new Livro[3];
        
        livros[1] = new Livro("Dom Casmurro", "Machado de Assis");
        livros[2] = new Livro("1984", "George Orwell");
        
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println();
        }
    }
}
