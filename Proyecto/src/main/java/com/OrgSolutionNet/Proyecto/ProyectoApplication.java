package com.OrgSolutionNet.Proyecto;

import com.OrgSolutionNet.Proyecto.Entities.Empresa;
import com.OrgSolutionNet.Proyecto.Entities.MovimientoDinero;
import com.OrgSolutionNet.Proyecto.Entities.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);

		/*Empresa pruebaEmpresa = new Empresa();
		System.out.println(pruebaEmpresa);

		pruebaEmpresa.setNombre("Organizacion.Net");
		pruebaEmpresa.setDireccion("Calle Perdidos en Java jaja");
		pruebaEmpresa.setTelefono("555 55 55");
		pruebaEmpresa.setNit("9808005566");
		System.out.println(pruebaEmpresa);

		Usuario pruebaUsuario = new Usuario();
		System.out.println(pruebaUsuario);

		pruebaUsuario.setEmpresaUsuario("enrique tutor");
		pruebaUsuario.setEmail("www.11_desarroladores.com");
		pruebaUsuario.setRolUsuario("mantenimiento");
		pruebaUsuario.setNombre_em("nueva_Organizacion.Net");
		System.out.println(pruebaUsuario);

		MovimientoDinero pruebaMovimientoDinero = new MovimientoDinero();
		System.out.println(pruebaMovimientoDinero);

		pruebaMovimientoDinero.setMonto(3000);
		pruebaMovimientoDinero.setMontosPositivo(5000);
		pruebaMovimientoDinero.setMontosNegativo(2000);
		pruebaMovimientoDinero.setConceptoMovimiento("pago");
		pruebaMovimientoDinero.setUsuario_encargado("Esteban");
		System.out.println(pruebaMovimientoDinero);*/

	}

}
