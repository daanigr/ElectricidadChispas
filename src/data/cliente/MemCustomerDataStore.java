package data.cliente;

import java.util.List;

public class MemCustomerDataStore implements  CustomerDataStore{

    private TreeMap<String, Cliente> dataStore = new TreeMap<String, Cliente>();

    @Override
    public void saveCustomer(Cliente cliente) {
        dataStore.put(cliente.codCliente, cliente);

    }

    @Override
    public void deleteCustomer(Cliente cliente) {
        dataStore.remove(cliente);

    }

    @Override
    public void updateCustomer(Cliente cliente) {
        dataStore.replace(cliente.codCliente, cliente);

    }

    @Override
    public List<Cliente> getAllCustomers() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Cliente findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}
