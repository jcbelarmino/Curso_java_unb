package aulaDesignPatterns;


//Interfaces abstratas que definem os produtos relacionados
interface Button {
 void render();
}

interface TextBox {
 void render();
}

//Implementações concretas dos produtos relacionados
class WindowsButton implements Button {
 public void render() {
     System.out.println("Renderizando botão no estilo Windows");
 }
}

class WindowsTextBox implements TextBox {
 public void render() {
     System.out.println("Renderizando caixa de texto no estilo Windows");
 }
}

class MacOSButton implements Button {
 public void render() {
     System.out.println("Renderizando botão no estilo macOS");
 }
}

class MacOSTextBox implements TextBox {
 public void render() {
     System.out.println("Renderizando caixa de texto no estilo macOS");
 }
}

//Interface abstrata que define as fábricas de produtos relacionados
interface GUIFactory {
 Button createButton();
 TextBox createTextBox();
}

//Implementações concretas das fábricas de produtos relacionados
class WindowsFactory implements GUIFactory {
 public Button createButton() {
     return new WindowsButton();
 }

 public TextBox createTextBox() {
     return new WindowsTextBox();
 }
}

class MacOSFactory implements GUIFactory {
 public Button createButton() {
     return new MacOSButton();
 }

 public TextBox createTextBox() {
     return new MacOSTextBox();
 }
}

//Classe que utiliza a Abstract Factory
class Application {
 private Button button;
 private TextBox textBox;

 public Application(GUIFactory factory) {
     button = factory.createButton();
     textBox = factory.createTextBox();
 }

 public void renderUI() {
     button.render();
     textBox.render();
 }
}

//Exemplo de uso do Abstract Factory
public class MainAbstractFactory {
 public static void main(String[] args) {
     // Criando uma aplicação com estilo Windows
     GUIFactory windowsFactory = new WindowsFactory();
     Application windowsApp = new Application(windowsFactory);
     windowsApp.renderUI();

     // Criando uma aplicação com estilo macOS
     GUIFactory macFactory = new MacOSFactory();
     Application macApp = new Application(macFactory);
     macApp.renderUI();
 }
}
