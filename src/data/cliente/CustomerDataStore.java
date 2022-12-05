package data.cliente;

public interface CustomerDataStore {

    void saveCustomer(Cliente cliente);

    void deleteCustomer(Cliente cliente);

    void updateCustomer(Cliente cliente);

    List<Cliente> getAllCustomers();

    Cliente findById(Integer codCliente);


}
