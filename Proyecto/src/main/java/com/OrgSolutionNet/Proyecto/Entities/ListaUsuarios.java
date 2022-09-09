package com.OrgSolutionNet.Proyecto.Entities;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private String name;
    private List<Usuario> usuarioList;

    public ListaUsuarios(String name) {
        this.name = name;
        this.usuarioList = new ArrayList<Usuario>();
    }


    public void addTask(Usuario usuario) {

        this.usuarioList.add(usuario);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Usuario> getUsuarioList() {

        return this.usuarioList;
    }


}
