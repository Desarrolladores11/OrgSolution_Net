package com.OrgSolutionNet.Proyecto.Entities;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class Empresa {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d93e24aea03c28ee602b793525f5957e5d052efe
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column (name= "id")
   public long id;
   @Column(name= "nit")
   private String nit;
   @Column(name= "nombre")
    private String nombre;
   @Column(name= "direccion")
    private String direccion;
   @Column(name= "telefono")
    private String telefono;
<<<<<<< HEAD

   public Empresa() {

=======

   public Empresa() {

=======
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nit;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;



    public Empresa() {

>>>>>>> ec64639b09e20d6a85a65b695a092c11c37e1176
>>>>>>> d93e24aea03c28ee602b793525f5957e5d052efe
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
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public void setDone(boolean b) {
    }
}
