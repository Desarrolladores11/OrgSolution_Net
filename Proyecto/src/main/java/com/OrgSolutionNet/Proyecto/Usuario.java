package com.OrgSolutionNet.Proyecto;

public class Usuario {

<<<<<<< HEAD
    private long id;
    private String nombre;
=======
    private String nombre_em;
>>>>>>> 91c6f0b8155495218a5a5d1ea4af83c50749d3c6
    private String email;
    private String empresaUsuario;
    private String rolUsuario;

    public Usuario() {
<<<<<<< HEAD
        this.id = 0001;
        this.nombre = "Erika Carvajal";
=======
        this.nombre_em = "Erika Carvajal";
>>>>>>> 91c6f0b8155495218a5a5d1ea4af83c50749d3c6
        this.email = "mirollo19@hot";
        this.empresaUsuario = "Alcaldia";
        this.rolUsuario = "Contratista";
    }

<<<<<<< HEAD
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
=======
    public Usuario(String nombre_em, String email, String empresaUsuario, String rolUsuario) {
        this.nombre_em = nombre_em;
        this.email = email;
        this.empresaUsuario = empresaUsuario;
        this.rolUsuario = rolUsuario;
    }

    public String getNombre_em() {
        return nombre_em;
>>>>>>> 91c6f0b8155495218a5a5d1ea4af83c50749d3c6
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
        return "Usuario{" +
                "nombre_em='" + nombre_em + '\'' +
                ", email='" + email + '\'' +
                ", empresaUsuario='" + empresaUsuario + '\'' +
                ", rolUsuario='" + rolUsuario + '\'' +
                '}';
    }
}
