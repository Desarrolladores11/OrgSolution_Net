package com.OrgSolutionNet.Proyecto.controllers;

import com.OrgSolutionNet.Proyecto.Entities.ListaEmpresa;
import com.OrgSolutionNet.Proyecto.Services.EmpresaService;
import org.springframework.web.bind.annotation.*;

@RestController //permite que springboot sepa que la funcion que se expone, se expone a los usuarios
public class ControladorEmpresa {
    EmpresaService service; //Propiedad para asceder al servicio

    //Constructor
    public ControladorEmpresa (){
        this.service = new EmpresaService();
    }

    @GetMapping ("/empresa")
    public ListaEmpresa obtenerDatosEmpresa(){
        return  this.service.getlistaEmpresa();

    }

    @PostMapping ("/empresa")
    public String crearDatosEmpresa(){

        return "Ingresar Datos OrgSolution_Net";
    }

    @PutMapping ("/empresa")
    public String actualizarDatosEmpresa(){

        return "Actualizar Datos OrgSolution_Net";
    }

    @DeleteMapping ("/empresa")
    public void eliminarDatosEmpresa(){

    }
}
