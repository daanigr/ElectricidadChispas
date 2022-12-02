public class Servicio implements LineaDeVentas {

    private String codigoServicio;
    private String nombreServicio;
    private Double precio;
    private Integer tipoIva;


    @Override
    public String getCodigo() {
        return codigoServicio;
    }

    @Override
    public String getNombre() {
        return nombreServicio;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public Integer getTipoIva() {
        return tipoIva;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTipoIva(Integer tipoIva) {
        this.tipoIva = tipoIva;
    }
}
