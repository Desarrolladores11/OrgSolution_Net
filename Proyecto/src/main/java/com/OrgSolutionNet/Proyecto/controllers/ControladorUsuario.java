package com.OrgSolutionNet.Proyecto.controllers;

import com.OrgSolutionNet.Proyecto.Entities.ListaUsuarios;
import com.OrgSolutionNet.Proyecto.Entities.Usuario;
import com.OrgSolutionNet.Proyecto.Services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping ("")
public class ControladorUsuario {
    UsuarioService service;

    public ControladorUsuario() {
        this.service = new UsuarioService();
    }

    @GetMapping("/usuario")
    public ListaUsuarios ListaUsuarios() {

        return this.service.getLstUsuarios();
    }

    @PostMapping("/usuario")
    public String crearDatosUsuario() {

        return "Ingresar Datos OrgSolution_Net";
    }

    @PutMapping("/usuario")
    public String actualizarDatosUsuario() {

        return "Actualizar Datos OrgSolution_Net";
    }

    @DeleteMapping("/usuario")
    public void eliminarDatosUsuario() {

    }
}

   /* @GetMapping ("/listausuario")
    public List<Usuario> ListaUsuarios (){return this.service.getLstUsuarios();}

    }*/



   // @GetMapping ("/lista")
    //public ListaUsuarios listaUsuarios(){
       // return this.service.getLstUsuarios();

