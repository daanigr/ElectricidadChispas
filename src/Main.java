public class Main {
    public static void main(String[] args) {
        Autonomo autonomo = new Autonomo();
        autonomo.setCodigoCliente();
        autonomo.setNombre();
        autonomo.setApellidos();
        autonomo.setPoblacion();
        autonomo.setProvincia();
        autonomo.setDireccion();
        autonomo.setDni();
        autonomo.setEmail();
        autonomo.setTelefono();

        Sociedad sociedad = new Sociedad();
        sociedad.setCodigoCliente();
        sociedad.setRazonSocial();
        sociedad.setPoblacion();
        sociedad.setProvincia();
        sociedad.setDireccion();
        sociedad.setCif();
        sociedad.setEmail();
        sociedad.setTelefono();
    }
}
