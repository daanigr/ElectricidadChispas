package presentation;

import domain.models.Autonomo;
import domain.models.Producto;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //domain.models.Autonomo
        Autonomo autonomo = new Autonomo();

        System.out.println("-----HOJA AUTONOMO-----");
        System.out.println("Introduce el codigo: ");
        autonomo.setCodigoCliente(sc.next());
        System.out.println("Introduce el nombre: ");
        autonomo.setNombre(sc.next());
        System.out.println("Introduce los apellidos: ");
        autonomo.setApellidos(sc.next());
        System.out.println("Introduce el DNI: ");
        autonomo.setDni(sc.next());
        System.out.println("Introduce la direccion: ");
        autonomo.setDireccion(sc.next());
        System.out.println("Introduce la poblacion: ");
        autonomo.setPoblacion(sc.next());
        System.out.println("Introduce la provincia: ");
        autonomo.setProvincia(sc.next());
        System.out.println("Introduce el email: ");
        autonomo.setEmail(sc.next());
        System.out.println("Introduce el telefono: ");
        autonomo.setTelefono(sc.next());



        //domain.models.Sociedad
        Sociedad sociedad = new Sociedad();

        System.out.println("-----HOJA SOCIEDAD-----");
        System.out.println("Introduce el codigo: ");
        sociedad.setCodigoCliente(sc.next());
        System.out.println("Introduce la razon social: ");
        sociedad.setRazonSocial(sc.next());
        System.out.println("Introduce el CIF: ");
        sociedad.setCif(sc.next());
        System.out.println("Introduce la direccion: ");
        sociedad.setCodigoCliente(sc.next());
        System.out.println("Introduce la poblacion: ");
        sociedad.setPoblacion(sc.next());
        System.out.println("Introduce la provincia: ");
        sociedad.setProvincia(sc.next());
        System.out.println("Introduce el email: ");
        sociedad.setEmail(sc.next());
        System.out.println("Introduce el telefono: ");
        sociedad.setTelefono(sc.next());


        //Producto1
        Producto producto = new Producto();

        System.out.println("-----HOJA PRODUCTO-----");
        System.out.println("Introduce el codigo: ");
        producto.setCodigoProducto(sc.next());
        System.out.println("Introduce el nombre: ");
        producto.setNombreProducto(sc.next());
        System.out.println("Introduce el precio: ");
        producto.setPrecio(sc.nextDouble());
        System.out.println("Introduce la marca: ");
        producto.setMarca(sc.next());
        System.out.println("Introduce el modelo: ");
        producto.setModelo(sc.next());
        System.out.println("Introduce el tipo de IVA: ");
        producto.setTipoIva(sc.nextInt());


        //Producto2
        Producto producto2 = new Producto();

        System.out.println("-----HOJA PRODUCTO 2-----");
        System.out.println("Introduce el codigo: ");
        producto2.setCodigoProducto(sc.next());
        System.out.println("Introduce el nombre: ");
        producto2.setNombreProducto(sc.next());
        System.out.println("Introduce el precio: ");
        producto2.setPrecio(sc.nextDouble());
        System.out.println("Introduce la marca: ");
        producto2.setMarca(sc.next());
        System.out.println("Introduce el modelo: ");
        producto2.setModelo(sc.next());
        System.out.println("Introduce el tipo de IVA: ");
        producto2.setTipoIva(sc.nextInt());


        //Servici1
        Servicio servicio = new Servicio();

        System.out.println("-----HOJA SERVICIO-----");
        System.out.println("Introduce el codigo: ");
        servicio.setCodigoServicio(sc.next());
        System.out.println("Introduce el nombre: ");
        servicio.setNombreServicio(sc.next());
        System.out.println("Introduce el precio: ");
        servicio.setPrecio(sc.nextDouble());
        System.out.println("Introduce el tipo de IVA: ");
        servicio.setTipoIva(sc.nextInt());


        //Servicio2
        Servicio servicio2 = new Servicio();

        System.out.println("-----HOJA SERVICIO 2-----");
        System.out.println("Introduce el codigo: ");
        servicio2.setCodigoServicio(sc.next());
        System.out.println("Introduce el nombre: ");
        servicio2.setNombreServicio(sc.next());
        System.out.println("Introduce el precio: ");
        servicio2.setPrecio(sc.nextDouble());
        System.out.println("Introduce el tipo de IVA: ");
        servicio2.setTipoIva(sc.nextInt());


        //FacturaAutonomo
        Factura facturaAutonomo = new Factura();

        System.out.println("-----HOJA FACTURA AUTONOMO-----");

        System.out.println("Introduce el codigo: ");
        facturaAutonomo.setCodigoFactura(sc.next());
        System.out.println("Introduce la fecha de la factura: ");
        facturaAutonomo.setFechaFactura(sc.nextLine());
        System.out.println("Introduce la base imponible: ");
        facturaAutonomo.setBaseImponible(sc.nextDouble());
        System.out.println("Introduce el total de la factura: ");

        ImpresionFactura.print(facturaAutonomo);

        //FacturaSociedad
        Factura facturaSociedad = new Factura();

        System.out.println("-----HOJA FACTURA SOCIEDAD-----");

        System.out.println("Introduce el codigo: ");
        facturaSociedad.setCodigoFactura(sc.next());
        System.out.println("Introduce la fecha de la factura: ");
        facturaSociedad.setFechaFactura(sc.nextLine());
        System.out.println("Introduce la base imponible: ");
        facturaSociedad.setBaseImponible(sc.nextDouble());
        System.out.println("Introduce el total de la factura: ");

        ImpresionFactura.print2(facturaSociedad);






    }
}
