package domain;


import data.CustomerDataStore;
import data.MemCustomerDataStore;

public class AddCustomerUseCase {

    public void execute(Cliente customer) {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);

    }

}
