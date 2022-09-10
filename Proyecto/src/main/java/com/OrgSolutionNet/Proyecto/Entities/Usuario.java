package com.OrgSolutionNet.Proyecto.Entities;

public class Usuario {

    private String nombre_em;
    private String email;
    private String empresaUsuario;
    private String rolUsuario;



    public Usuario(String nombre_em, String email, String empresaUsuario, String rolUsuario) {
        this.nombre_em = nombre_em;
        this.email = email;
        this.empresaUsuario = empresaUsuario;
        this.rolUsuario = rolUsuario;
    }

    public String getNombre_em() {
        return nombre_em;
    }

    public void setNombre_em(String nombre_em) {
        this.nombre_em = nombre_em;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaUsuario() {
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


}
