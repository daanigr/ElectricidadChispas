package domain.usecase.facturas;

import data.cliente.CustomerDataStore;
import domain.models.Cliente;

import java.util.List;


public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomersUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<Cliente> execute() {
        return customerDataStore.getAllCustomers();
    }
}