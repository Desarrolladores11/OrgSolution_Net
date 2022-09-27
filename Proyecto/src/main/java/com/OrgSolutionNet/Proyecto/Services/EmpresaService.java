package com.OrgSolutionNet.Proyecto.Services;

import com.OrgSolutionNet.Proyecto.Entities.Empresa;
<<<<<<< HEAD
//import com.OrgSolutionNet.Proyecto.Entities.ListaEmpresa;
import com.OrgSolutionNet.Proyecto.Repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    private EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository){

        this.repository = repository;
    }

    public List<Empresa> getlistaEmpresa(){
        return this.repository.findAll(); // Obtener informacion desde la base de datos
    }

    public Empresa crearEmpresa (Empresa nuevaEmpresa){
        return this.repository.save(nuevaEmpresa);
    }

    public Empresa actualizarEmpresa (Empresa nuevaEmpresa){
        return this.repository.saveAndFlush(nuevaEmpresa);
    }

    public void eliminarEmpresa (Long id) {
       repository.deleteById(id);
    }

    public Boolean markEmpresaAsFinished(Long id){
        Optional<Empresa> empresa = this.repository.findById(id);
        if(empresa.isPresent()){
            empresa.get().setDone(true);
            this.repository.save(empresa.get());
            return true;
        }
        return false;

    }

    public Boolean deleteEmpresa(Long id){
        this.repository.deleteById(id);
        return true;
=======
import com.OrgSolutionNet.Proyecto.Entities.ListaEmpresa;

public class EmpresaService {
    Empresa empresa1;
    Empresa empresa2;
    ListaEmpresa entidades;


    public EmpresaService(){

        this.empresa1 = new Empresa("OrgSolution_Net", "Calle Desarrolladores11", "555 55 55", "9808000101-1");
        this.empresa2 = new Empresa("OrgSolution_Web", "Calle hoy una nueva", "506 08 24", "9808000101-1");
        this.entidades = new ListaEmpresa("OrgSolution_Net");
        entidades.addEmpresa(empresa1);
        entidades.addEmpresa(empresa2);
    }
    //Permite consultar las entidades en este caso las empresa que existen

    public ListaEmpresa getlistaEmpresa(){
        return this.entidades;
>>>>>>> ec64639b09e20d6a85a65b695a092c11c37e1176
    }

}
