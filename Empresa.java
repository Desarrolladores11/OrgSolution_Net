public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Empresa empresa = (Empresa) object;
        return java.util.Objects.equals(nombre, empresa.nombre) && java.util.Objects.equals(direccion, empresa.direccion) && java.util.Objects.equals(telefono, empresa.telefono) && java.util.Objects.equals(nit, empresa.nit);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, direccion, telefono, nit);
    }
}
