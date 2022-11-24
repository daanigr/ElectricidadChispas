public class Sociedad implements Cliente{

    private Integer codigoCliente;
    private String razonSocial;
    private String cif;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public String getNombre() {
        return razonSocial;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }
}

