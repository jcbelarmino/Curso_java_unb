package aulaGenerics;

import aula3oo.heranca.Animal;

public class MainCaixa {
	public static void main(String[] args) {
		Animal a = new Animal();
    	Caixa<Animal> c = new Caixa<>();
		c.setConteudo(a);
		Animal a1 = c.getConteudo();
		System.out.println("Conteúdo da caixa Animal: " + a1);
	}
}
