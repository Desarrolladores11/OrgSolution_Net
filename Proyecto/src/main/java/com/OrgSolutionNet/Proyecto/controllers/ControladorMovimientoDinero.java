package com.OrgSolutionNet.Proyecto.controllers;

import com.OrgSolutionNet.Proyecto.Empresa;
import com.OrgSolutionNet.Proyecto.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/MovimientoDinero")

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
