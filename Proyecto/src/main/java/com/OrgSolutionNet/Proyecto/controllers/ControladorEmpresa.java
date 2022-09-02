package com.OrgSolutionNet.Proyecto.controllers;

import com.OrgSolutionNet.Proyecto.Empleado;
import com.OrgSolutionNet.Proyecto.Empresa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/empresa")
public class ControladorEmpresa {

    @GetMapping ("")
    public Empresa obtenerDatosEmpresa(){
        Empresa pruebaEmpresa = new Empresa();
        return pruebaEmpresa;
    }

    @PostMapping
    public String crearDatosEmpresa(){
        return "Ingresar Datos OrgSolution_Net";
    }

    @PutMapping
    public String actualizarDatosEmpresa(){
        return "Actualizar Datos OrgSolution_Net";
    }

    @DeleteMapping
    public void eliminarDatosEmpresa(){

    }
}
