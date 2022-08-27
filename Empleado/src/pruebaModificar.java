public class pruebaModificar {
    private Modificar md = new Modificar();

    public pruebaModificar() {
        this.md = new Modificar();
    }

    public void procesarInformacion() {
        //Anexar Datos a la coleccion
        Empleado unEmpleado = new Empleado("Daniel Alejandro","dancho_007@hotmail.com","henkel internacional","jefe compras");
        md.anexarEmpleado (unEmpleado);


//imprimir datos de la coleccion

        md.imprimirLista();
    //actualizar datos de la coleccion

        md.actualizarDatosEmpleado(2, new Empleado("jose","jose@gmail","alejo","jefe"));
        md.imprimirLista();

        //borrar datos de la coleccion
            md.borrarEmpleado(1);
            md.imprimirLista();
    }
        public static void main(String[] args) {
            pruebaModificar app = new pruebaModificar();
             app.procesarInformacion();
    }

}




