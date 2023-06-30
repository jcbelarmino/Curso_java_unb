package aula3oo.arrays;

class Pessoa {
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

public class ExemploArrayObjetos {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        
        pessoas[0] = new Pessoa("João");
        pessoas[1] = new Pessoa("Maria");
        pessoas[2] = new Pessoa("Pedro");
        
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
