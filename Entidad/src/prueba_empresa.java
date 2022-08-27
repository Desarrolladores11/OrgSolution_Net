public class prueba_empresa {
    public static void main(String[] args) {
        empresa PrimeraPrueba = new empresa();
        System.out.println(PrimeraPrueba);

        PrimeraPrueba.setDireccion("falsa calle");
        PrimeraPrueba.setNit("456");
        PrimeraPrueba.setNombre("11_desarrolladores");
        PrimeraPrueba.setTelefono("999");
        System.out.println(PrimeraPrueba);

        empleado SegundaPrueba = new empleado();
        System.out.println(SegundaPrueba);

        SegundaPrueba.setEmpresa("enrique");
        SegundaPrueba.setCorreo("www.11_desarroladores.com");
        SegundaPrueba.setRol("mantenimiento");
        SegundaPrueba.setNombre_em("manuelito");
        System.out.println(SegundaPrueba);

        MovimientoDinero terceraPrueba = new MovimientoDinero();
        System.out.println(terceraPrueba);

        terceraPrueba.setMonto("14000");
        terceraPrueba.setMonto_positivo("12000");
        terceraPrueba.setMonto_negativo("-12000");
        terceraPrueba.setConcepto("compra mouse");
        terceraPrueba.setUsuario("ivancito");
        System.out.println(SegundaPrueba);

    }
}
