package com.OrgSolutionNet.Proyecto.controllers;

<<<<<<< HEAD
import com.OrgSolutionNet.Proyecto.Entities.Empresa;
import com.OrgSolutionNet.Proyecto.Repositories.EmpresaRepository;
import com.OrgSolutionNet.Proyecto.Services.EmpresaService;
import org.springframework.ui.Model;
<<<<<<< HEAD
=======
=======
import com.OrgSolutionNet.Proyecto.Entities.ListaEmpresa;
import com.OrgSolutionNet.Proyecto.Services.EmpresaService;
>>>>>>> ec64639b09e20d6a85a65b695a092c11c37e1176
>>>>>>> d93e24aea03c28ee602b793525f5957e5d052efe
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController //permite que springboot sepa que la funcion que se expone, se expone a los usuarios
public class ControladorEmpresa {
    EmpresaService service; //Propiedad para asceder al servicio
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d93e24aea03c28ee602b793525f5957e5d052efe
    //Constructor
    public ControladorEmpresa (EmpresaService service){

        this.service = service;
    }

  /* @GetMapping ("/empresa")
   public List<Empresa> obtenerDatosEmpresa(){
       return  this.service.getlistaEmpresa();
   }*/


    public List<Empresa> obtenerDatosEmpresa(@PathVariable ("id") long id){
        return  this.service.getlistaEmpresa();
    }
    /*@GetMapping ("/empresa")
    public List<Empresa> obtenerDatosEmpresa(@PathVariable ("id") long id){
        return  this.service.getlistaEmpresa();
    }*/
    @PostMapping ("/empresa")
    public RedirectView crearEmpresa(@ModelAttribute Empresa empresanew, Model model) {
        model.addAttribute(empresanew);

        this.service.crearEmpresa(empresanew);
        return new RedirectView("/empresa");
    }
    @PostMapping ("/empresa/creadores")
    public RedirectView crearEmpresa_image(@ModelAttribute Empresa empresaImage, Model model) {
        model.addAttribute(empresaImage);

//        this.service.crearEmpresa(empresaImage);
        return new RedirectView("/creadores");
<<<<<<< HEAD
    }

    @PatchMapping("/empresa/{id}")
    public RedirectView updateEmpresa(@PathVariable ("id") long id){
        this.service.markEmpresaAsFinished(id);
        return new RedirectView("/empresa");
=======
    }

    @PatchMapping("/empresa/{id}")
    public RedirectView updateEmpresa(@PathVariable ("id") long id){
        this.service.markEmpresaAsFinished(id);
        return new RedirectView("/empresa");
=======

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
>>>>>>> ec64639b09e20d6a85a65b695a092c11c37e1176
>>>>>>> d93e24aea03c28ee602b793525f5957e5d052efe

    }

    @PutMapping ("/empresa")
    public void actualizarDatosEmpresa(@RequestBody Empresa empresanew){

        service.actualizarEmpresa(empresanew);
    }
    @DeleteMapping ("empresa/{id}")
    public RedirectView deleteEmpresa(@PathVariable ("id") long id){
        this.service.deleteEmpresa(id);
        return new RedirectView("/empresa");

    }



}
