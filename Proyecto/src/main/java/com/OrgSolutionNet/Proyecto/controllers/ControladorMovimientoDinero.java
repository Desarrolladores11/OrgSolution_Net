package com.OrgSolutionNet.Proyecto.controllers;
<<<<<<< HEAD
import com.OrgSolutionNet.Proyecto.Entities.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/movimientodinero")
=======

import com.OrgSolutionNet.Proyecto.Empresa;
import com.OrgSolutionNet.Proyecto.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/MovimientoDinero")
>>>>>>> ee5f7dfd1712464990c67d836e1e05539e374378

public class ControladorMovimientoDinero {


            @GetMapping("")
        public MovimientoDinero obtenerDatosMovimientoDinero(){
            MovimientoDinero MovDi = new MovimientoDinero();
            return MovDi;
        }

        @PostMapping
        public String crearDatosMovimientoDinero(){
            return "Ingresar Datos OrgSolution_Net";
        }

        @PutMapping
        public String actualizarMovimientoDinero(){
            return "Actualizar Datos OrgSolution_Net";
        }

        @DeleteMapping
        public void eliminarDatosMovimientoDinero(){

        }
}
