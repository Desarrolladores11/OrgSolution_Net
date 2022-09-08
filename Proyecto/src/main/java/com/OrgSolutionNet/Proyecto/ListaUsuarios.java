package com.OrgSolutionNet.Proyecto;
import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private List<Usuario> usuariolList;

    public ListaUsuarios() {
        this.usuariolList = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario usuario){
        this.usuarioList.add(usuario);
    }
}
