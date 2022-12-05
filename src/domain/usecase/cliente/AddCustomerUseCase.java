package domain.usecase.cliente;


import data.cliente.CustomerDataStore;
import domain.models.Cliente;

public class AddCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente customer) {
        customerDataStore.saveCustomer(customer);
    }
}