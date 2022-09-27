public class empleado {
    private String nombre_em;
    private String correo;
    private String Empresa;
    private String rol;

    public empleado() {
        this.nombre_em = "joselito";
        this.correo = "www.desarroladores_11.com";
        this.rol = "ventas";
        this.Empresa = "desarrolladores";

    }

    public String getNombre_em() {
        return nombre_em;
    }

    public void setNombre_em(String nombre_em) {
        this.nombre_em = nombre_em;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "nombre_em='" + nombre_em + '\'' +
                ", correo='" + correo + '\'' +
                ", Empresa='" + Empresa + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
