package com.OrgSolutionNet.Proyecto.Services;

import com.OrgSolutionNet.Proyecto.Entities.ListaUsuarios;
import com.OrgSolutionNet.Proyecto.Entities.Usuario;

public class UsuarioService {
    Usuario usuario1;
    Usuario usuario2;
    Usuario usuario3;
    ListaUsuarios lstUsuarios;
    public UsuarioService() {
        this.usuario1 = new Usuario("Natalia","erika.carvajal@", "Inder", "Asesor");
        this.usuario2 = new Usuario("Esteban","erika.carvajal@", "Inder", "Asesor");
        this.usuario3 = new Usuario("Augusto","erika.carvajal@", "Inder", "Asesor");
        this.lstUsuarios = new ListaUsuarios("lista de Datos");

        lstUsuarios.addTask(usuario1);
        lstUsuarios.addTask(usuario2);
        lstUsuarios.addTask(usuario3);

    }

    public ListaUsuarios getLstUsuarios(){
        return this.lstUsuarios;
    }


}
