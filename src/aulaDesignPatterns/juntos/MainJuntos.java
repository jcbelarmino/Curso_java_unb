package aulaDesignPatterns.juntos;

import java.util.HashMap;
import java.util.Map;

//Business Components
class OrderComponent {
	public void createOrder() {
		System.out.println("Pedido criado com sucesso.");
	}
}

class CustomerComponent {
	public void createCustomer() {
		System.out.println("Cliente criado com sucesso.");
	}
}

//Service Locator
class ServiceLocator {
	private static ServiceLocator instance;
	private Map<String, Object> services;

	private ServiceLocator() {
		services = new HashMap<>();
		services.put("OrderComponent", new OrderComponent());
		services.put("CustomerComponent", new CustomerComponent());
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public Object getService(String serviceName) {
		if (!services.containsKey(serviceName)) {
			throw new IllegalArgumentException("Serviço não encontrado: " + serviceName);
		}
		return services.get(serviceName);
	}
}

//Session Facade
class ECommerceFacade {
	private static ECommerceFacade instance;
	private Object orderComponent;
	private Object customerComponent;

	private ECommerceFacade() {
		ServiceLocator serviceLocator = ServiceLocator.getInstance();
		orderComponent = serviceLocator.getService("OrderComponent");
		customerComponent = serviceLocator.getService("CustomerComponent");
	}

	public static ECommerceFacade getInstance() {
		if (instance == null) {
			instance = new ECommerceFacade();
		}
		return instance;
	}

	public void createOrder() {
		((OrderComponent) orderComponent).createOrder();
	}

	public void createCustomer() {
		((CustomerComponent) customerComponent).createCustomer();
	}
}

//Business Delegate
class BusinessDelegate {
	private ECommerceFacade ecommerceFacade;

	public BusinessDelegate() {
		ecommerceFacade = ECommerceFacade.getInstance();
	}

	public void doTask() {
		ecommerceFacade.createOrder();
		ecommerceFacade.createCustomer();
	}
}

//Exemplo de uso dos padrões Business Delegate, Service Locator, Session Facade e Singleton
public class MainJuntos {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.doTask();
		// Output:
		// Pedido criado com sucesso.
		// Cliente criado com sucesso.
	}
}
