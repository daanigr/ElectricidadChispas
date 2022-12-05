package domain.usecase.ventas;

import data.cliente.CustomerDataStore;
import domain.models.Cliente;

public class DeleteCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }


    public void execute(Cliente cliente){
        customerDataStore.deleteCustomer(cliente);
    }

}

