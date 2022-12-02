public class ImpresionFactura {

    public static void print(Factura facturaAutonomo){
        System.out.println(facturaAutonomo.getCodigoFactura());
        System.out.println(facturaAutonomo.getFechaFactura());
        System.out.println(facturaAutonomo.getBaseImponible());
        System.out.println(facturaAutonomo.getTotalFactura());
    }

    public static void print2(Factura facturaSociedad){
        System.out.println(facturaSociedad.getCodigoFactura());
        System.out.println(facturaSociedad.getFechaFactura());
        System.out.println(facturaSociedad.getBaseImponible());
        System.out.println(facturaSociedad.getTotalFactura());
    }

}
