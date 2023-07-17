package aulaDesignPatterns.serviceLocator;

import java.util.HashMap;
import java.util.Map;

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

//Service Locator
class ServiceLocator {
	private static ServiceLocator instance;
	private Map<String, BusinessService> services;

	private ServiceLocator() {
		services = new HashMap<>();
		services.put("EJB", new EJBService());
		services.put("JMS", new JMSService());
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public BusinessService getService(String serviceType) {
		if (!services.containsKey(serviceType)) {
			throw new IllegalArgumentException("Tipo de serviço inválido: " + serviceType);
		}
		return services.get(serviceType);
	}
}

//Business Delegate
class BusinessDelegate {
	private ServiceLocator serviceLocator;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		serviceLocator = ServiceLocator.getInstance();
		BusinessService businessService = serviceLocator.getService(serviceType);
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

//Exemplo de uso do padrão Business Delegate e Service Locator
public class MainServiceLocator {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask(); // Output: EJBService está processando a solicitação.

		businessDelegate.setServiceType("JMS");
		client.doTask(); // Output: JMSService está processando a solicitação.
	}
}
