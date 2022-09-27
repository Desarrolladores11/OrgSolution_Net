package com.OrgSolutionNet.Proyecto.Repositories;

import com.OrgSolutionNet.Proyecto.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
=======
public interface EmpresaRepository extends JpaRepository<Empresa, String> {
>>>>>>> ec64639b09e20d6a85a65b695a092c11c37e1176

}
