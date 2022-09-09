package com.OrgSolutionNet.Proyecto.Entities;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpresa {
    private String nombreEmpresa;
    private List<Empresa> listaEmpresas;

    public ListaEmpresa() {
    }

    public ListaEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpresas = new ArrayList<Empresa>();
    }

    public void addEmpresa (Empresa empresa){
        this.listaEmpresas.add(empresa);

    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(List<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
}
