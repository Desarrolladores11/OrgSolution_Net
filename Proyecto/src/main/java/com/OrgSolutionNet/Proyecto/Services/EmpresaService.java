package com.OrgSolutionNet.Proyecto.Services;

import com.OrgSolutionNet.Proyecto.Entities.Empresa;
import com.OrgSolutionNet.Proyecto.Entities.ListaEmpresa;

public class EmpresaService {
    Empresa empresa1;
    Empresa empresa2;
    ListaEmpresa entidades;


    public EmpresaService(){

        this.empresa1 = new Empresa("OrgSolution_Net", "Calle Desarrolladores11", "555 55 55", "9808000101-1");
        this.empresa2 = new Empresa("OrgSolution_Web", "Calle hoy una nueva", "506 08 24", "9808000101-1");
        this.entidades = new ListaEmpresa("OrgSolution_Net");
        entidades.addEmpresa(empresa1);
        entidades.addEmpresa(empresa2);
    }
    //Permite consultar las entidades en este caso las empresa que existen

    public ListaEmpresa getlistaEmpresa(){
        return this.entidades;
    }

}
