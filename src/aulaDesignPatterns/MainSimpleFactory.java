package aulaDesignPatterns;

//Classe de interface abstrata ou interface
interface Animal {
 void sound();
}

//Classes concretas que implementam a interface Animal
class Dog implements Animal {
 public void sound() {
     System.out.println("O cachorro late");
 }
}

class Cat implements Animal {
 public void sound() {
     System.out.println("O gato mia");
 }
}

//Simple Factory
class AnimalFactory {
 public Animal createAnimal(String type) {
     if (type.equalsIgnoreCase("dog")) {
         return new Dog();
     } else if (type.equalsIgnoreCase("cat")) {
         return new Cat();
     } else {
         throw new IllegalArgumentException("Tipo de animal inválido");
     }
 }
}

//Exemplo de uso do Simple Factory
public class MainSimpleFactory {
 public static void main(String[] args) {
     AnimalFactory animalFactory = new AnimalFactory();
     
     // Criando um objeto Dog usando a Simple Factory
     Animal dog = animalFactory.createAnimal("dog");
     dog.sound(); // Output: O cachorro late
     
     // Criando um objeto Cat usando a Simple Factory
     Animal cat = animalFactory.createAnimal("cat");
     cat.sound(); // Output: O gato mia
 }
}
