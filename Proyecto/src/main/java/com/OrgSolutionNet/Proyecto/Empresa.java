package com.OrgSolutionNet.Proyecto;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    public Empresa() {
        this.nombre = "OrgSolution_Net";
        this.direccion = "Calle Desarrolladores11";
        this.telefono = "555 55 55";
        this.nit = "9808000101-1";

    }

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

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nit=" + nit +
                '}';
    }
}
