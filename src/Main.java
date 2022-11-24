public class Main {
    public static void main(String[] args) {
        Autonomo autonomo = new Autonomo();
        autonomo.setCodigoCliente(1);
        autonomo.setNombre("Daniel");
        autonomo.setApellidos("Apellido1 Apellido2");
        autonomo.setPoblacion("Avila");
        autonomo.setProvincia("Avila");
        autonomo.setDireccion("Dir Avila");
        autonomo.setDni("00000000A");
        autonomo.setEmail("email@email.es");
        autonomo.setTelefono("600000000");

        Sociedad sociedad = new Sociedad();
        sociedad.setCodigoCliente(1);
        sociedad.setRazonSocial("Empresa S.L.");
        sociedad.setPoblacion("Avila");
        sociedad.setProvincia("Avila");
        sociedad.setDireccion("Av. Avila");
        sociedad.setCif("00000000A");
        sociedad.setEmail("email@email.es");
        sociedad.setTelefono("600000000");

        printAutonomos(autonomo);
        printSociedades(sociedad);
    }

    public static void printAutonomos(Autonomo autonomo) {
        System.out.println("Cod: " + autonomo.getCodigoCliente() + " Nombre: " + autonomo.getNombre());
    }
    public static void printSociedades(Sociedad sociedad) {
        System.out.println("Cod: " + sociedad.getCodigoCliente() + " Nombre " + sociedad.getNombre());
    }
    public static  void printClientes(Cliente cliente) {
        System.out.println("Cod: " + cliente.getCodigoCliente() + " Nombre " + cliente.getNombre());
    }
}
