package com.OrgSolutionNet.Proyecto.controllers;

import com.OrgSolutionNet.Proyecto.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/usuario")
public class ControladorUsuario {

    @GetMapping ("")
    public Usuario obtenerDatosUsuario(){
        Usuario pruebaUsuario = new Usuario();
        return pruebaUsuario;
    }

    @PostMapping
    public String crearDatosUsuario(){
        return "Ingresar Datos OrgSolution_Net";
    }

    @PutMapping
    public String actualizarDatosUsuario(){
        return "Actualizar Datos OrgSolution_Net";
    }

    @DeleteMapping
    public void eliminarDatosUsuario(){

    }
}
