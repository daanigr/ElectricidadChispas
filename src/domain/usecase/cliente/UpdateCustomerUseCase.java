package domain.usecase.cliente;

import data.cliente.CustomerDataStore;
import domain.models.Cliente;

public class UpdateCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente) {
        customerDataStore.updateCustomer(cliente);
    }

}

