package aulaDesignPatterns;

//Classe abstrata que define o produto
abstract class Logger {
 public abstract void log(String message);
}

//Classes concretas que implementam o produto
class FileLogger extends Logger {
 public void log(String message) {
     System.out.println("Registrando mensagem em um arquivo: " + message);
 }
}

class DatabaseLogger extends Logger {
 public void log(String message) {
     System.out.println("Registrando mensagem em um banco de dados: " + message);
 }
}

//Classe abstrata que define o Factory Method
abstract class LoggerFactory {
 public void doLog(String message) {
     Logger logger = createLogger();
     logger.log(message);
 }
 
 protected abstract Logger createLogger();
}

//Classes concretas que implementam o Factory Method
class FileLoggerFactory extends LoggerFactory {
 protected Logger createLogger() {
     return new FileLogger();
 }
}

class DatabaseLoggerFactory extends LoggerFactory {
 protected Logger createLogger() {
     return new DatabaseLogger();
 }
}

//Exemplo de uso do Factory Method
public class MainMethodFactory {
 public static void main(String[] args) {
     LoggerFactory loggerFactory = new FileLoggerFactory();
     loggerFactory.doLog("Mensagem de log no arquivo");
     
     loggerFactory = new DatabaseLoggerFactory();
     loggerFactory.doLog("Mensagem de log no banco de dados");
 }
}
