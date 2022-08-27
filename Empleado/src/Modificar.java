import java.util.ArrayList;
import java.util.List;

public class Modificar {

    public Object anexarEmpleado;
    private List <Empleado> coleccionEmpleado;

    public Modificar() {
        this.coleccionEmpleado = new ArrayList<>();

    }

    public void anexarEmpleado(Empleado unEmpleado) {
        this.coleccionEmpleado.add(unEmpleado);
    }
    public void imprimirLista() {
        System.out.println(coleccionEmpleado);
    }
    public void actualizarDatosEmpleado(int idx, Empleado unEmpleado) {
        coleccionEmpleado.set(idx,unEmpleado);}
    public void borrarEmpleado(int id) {
        coleccionEmpleado.remove(id);}

}

