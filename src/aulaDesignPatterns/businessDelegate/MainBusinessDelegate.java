package aulaDesignPatterns.businessDelegate;

//Interface BusinessService
interface BusinessService {
	void doProcessing();
}

//Concrete Business Services
class EJBService implements BusinessService {
	public void doProcessing() {
		System.out.println("EJBService está processando a solicitação.");
	}
}

class JMSService implements BusinessService {
	public void doProcessing() {
		System.out.println("JMSService está processando a solicitação.");
	}
}

//Business Delegate
class BusinessDelegate {
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		if (serviceType.equalsIgnoreCase("EJB")) {
			businessService = new EJBService();
		} else if (serviceType.equalsIgnoreCase("JMS")) {
			businessService = new JMSService();
		} else {
			throw new IllegalArgumentException("Tipo de serviço inválido: " + serviceType);
		}

		businessService.doProcessing();
	}
}

//Client
class Client {
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public void doTask() {
		businessDelegate.doTask();
	}
}

//Exemplo de uso do padrão Business Delegate
public class MainBusinessDelegate {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask(); // Output: EJBService está processando a solicitação.

		businessDelegate.setServiceType("JMS");
		client.doTask(); // Output: JMSService está processando a solicitação.
	}
}
