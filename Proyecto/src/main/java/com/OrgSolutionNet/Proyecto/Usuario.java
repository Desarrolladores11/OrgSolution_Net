package com.OrgSolutionNet.Proyecto;

public class Usuario {

    private long id;
    private String nombre;
    private String email;
    private String empresaUsuario;
    private String rolUsuario;

    public Usuario() {
        this.id = 0001;
        this.nombre = "Erika Carvajal";
        this.email = "mirollo19@hot";
        this.empresaUsuario = "Alcaldia";
        this.rolUsuario = "Contratista";
    }

    public Usuario(long id, String nombre, String email, String empresaEmpleado, String rolEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.empresaUsuario = empresaUsuario;
        this.rolUsuario = getRolUsuario();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaUsurio() {
        return empresaUsuario;
    }

    public void setEmpresaUsuario(String empresaUsurio) {
        this.empresaUsuario= empresaUsurio;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", empresaUsuario='" + empresaUsuario + '\'' +
                ", rolUsuario='" + rolUsuario + '\'' +
                '}';
    }
}
