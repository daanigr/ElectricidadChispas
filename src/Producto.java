public class Producto implements LineaDeVentas{

    private String codigoProducto;
    private String nombreProducto;
    private Double precio;
    private String marca;
    private String modelo;
    private Integer tipoIva;


    @Override
    public String getCodigo() {
        return codigoProducto;
    }

    @Override
    public String getNombre() {
        return nombreProducto;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public Integer getTipoIva() {
        return tipoIva;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoIva(Integer tipoIva) {
        this.tipoIva = tipoIva;
    }
}
