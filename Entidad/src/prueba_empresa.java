public class prueba_empresa {
    public static void main(String[] args) {
        empresa unaPrueba = new empresa();
        System.out.println(unaPrueba);

        unaPrueba.setDireccion("falsa calle");
        unaPrueba.setNit("456");
        unaPrueba.setNombre("11_desarrolladores");
        unaPrueba.setTelefono("999");
        System.out.println(unaPrueba);
    }
}
