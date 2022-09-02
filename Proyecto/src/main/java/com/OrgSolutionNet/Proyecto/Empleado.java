package com.OrgSolutionNet.Proyecto;

public class Empleado {

    private String nombre;
    private String email;
    private String empresaEmpleado;
    private String rolEmpleado;

    public Empleado() {
        this.nombre = "Erika Carvajal";
        this.email = "mirollo19@hot";
        this.empresaEmpleado = "Alcaldia";
        this.rolEmpleado = "Contratista";
    }

    public Empleado(String nombre, String email, String empresaEmpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.email = email;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
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

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", empresaEmpleado='" + empresaEmpleado + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                '}';
    }
}
