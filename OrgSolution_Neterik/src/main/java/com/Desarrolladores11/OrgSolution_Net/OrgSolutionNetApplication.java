package com.Desarrolladores11.OrgSolution_Net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class OrgSolutionNetApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OrgSolutionNetApplication.class, args);
		Empresa nombre1 = new Empresa("Rappi","Bello", "590 00 11", "985008000-1");

		System.out.println(nombre1.getNombre());
		System.out.println(nombre1.getDireccion());
		System.out.println(nombre1.getTelefono());
		System.out.println(nombre1.getNit());


	}

}
