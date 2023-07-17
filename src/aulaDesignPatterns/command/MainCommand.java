package aulaDesignPatterns.command;

//Interface Command
interface Command {
	void execute();
}

//Receiver
class Light {
	public void turnOn() {
		System.out.println("Luz ligada.");
	}

	public void turnOff() {
		System.out.println("Luz desligada.");
	}
}

//Concrete Commands
class TurnOnCommand implements Command {
	private Light light;

	public TurnOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOn();
	}
}

class TurnOffCommand implements Command {
	private Light light;

	public TurnOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}
}

//Invoker
class RemoteControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}

//Exemplo de uso do padrão Command
public class MainCommand {
	public static void main(String[] args) {
		// Criando o Receiver
		Light light = new Light();

		// Criando os Concrete Commands
		Command turnOnCommand = new TurnOnCommand(light);
		Command turnOffCommand = new TurnOffCommand(light);

		// Criando o Invoker
		RemoteControl remoteControl = new RemoteControl();

		// Configurando os comandos no Invoker
		remoteControl.setCommand(turnOnCommand);
		remoteControl.pressButton(); // Output: Luz ligada.

		remoteControl.setCommand(turnOffCommand);
		remoteControl.pressButton(); // Output: Luz desligada.
	}
}
