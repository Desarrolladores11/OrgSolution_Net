package com.Service;
import com.OrgSolutionNet.Proyecto.Usuario;

public class UsuarioService {

    private Usuario usuario1, usuario2, usuario3;
    private ListaUsuarios lstUsuarios;

    public UsuarioService() {
        //this.usuario1 = new Usuario(id: 0001, nombre: "Esteban", email: "usuario1@mintic.com.co", empresaUsuario: "Alcaldia", rolusarioa: "Contratista");
        this.lstUsuarios = new ListaUsuarios();
        lstUsuarios.agregarUsuario(usuario1);
    }

    public ListaUsuarios getLstUsuarios(){
        return this.lstUsuarios;

    }
}
