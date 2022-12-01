package domain.usecase;

import data.CustomerDataStore;
import data.MemCustomerDataStore;

public class GetCustomerUseCase {

    public List<Cliente> execute() {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        return  customerDataStore
    }
}

