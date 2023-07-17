package aulaDesignPatterns.sessionFacade;

//Business Components
class OrderComponent {
	public void createOrder() {
		System.out.println("Pedido criado com sucesso.");
	}

	public void cancelOrder() {
		System.out.println("Pedido cancelado com sucesso.");
	}
}

class CustomerComponent {
	public void createCustomer() {
		System.out.println("Cliente criado com sucesso.");
	}

	public void updateCustomer() {
		System.out.println("Cliente atualizado com sucesso.");
	}
}

class InventoryComponent {
	public void checkStock() {
		System.out.println("Estoque verificado com sucesso.");
	}

	public void updateStock() {
		System.out.println("Estoque atualizado com sucesso.");
	}
}

//Session Facade
class ECommerceFacade {
	private OrderComponent orderComponent;
	private CustomerComponent customerComponent;
	private InventoryComponent inventoryComponent;

	public ECommerceFacade() {
		orderComponent = new OrderComponent();
		customerComponent = new CustomerComponent();
		inventoryComponent = new InventoryComponent();
	}

	public void createOrder() {
		orderComponent.createOrder();
		inventoryComponent.updateStock();
	}

	public void cancelOrder() {
		orderComponent.cancelOrder();
		inventoryComponent.updateStock();
	}

	public void createCustomer() {
		customerComponent.createCustomer();
	}

	public void updateCustomer() {
		customerComponent.updateCustomer();
	}

	public void checkStock() {
		inventoryComponent.checkStock();
	}
}

//Exemplo de uso do padrão Session Facade
public class MainSessionFacade {
	public static void main(String[] args) {
		ECommerceFacade ecommerceFacade = new ECommerceFacade();

		ecommerceFacade.createOrder(); // Output: Pedido criado com sucesso. Estoque atualizado com sucesso.

		ecommerceFacade.createCustomer(); // Output: Cliente criado com sucesso.

		ecommerceFacade.updateCustomer(); // Output: Cliente atualizado com sucesso.

		ecommerceFacade.cancelOrder(); // Output: Pedido cancelado com sucesso. Estoque atualizado com sucesso.

		ecommerceFacade.checkStock(); // Output: Estoque verificado com sucesso.
	}
}
