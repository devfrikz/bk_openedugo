package com.openedugo.openedugo.repository;

import com.openedugo.openedugo.entity.DocenteEntity;
import com.openedugo.openedugo.entity.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteEntity, Integer> {

    // Busca un docente por su número de profesor.
    Optional<DocenteEntity> findByNumeroProfesor(String numeroProfesor);

    // Busca un docente por nombre y apellidos.
    Optional<DocenteEntity> findByNombreAndApellidos(String nombre, String apellidos);

    // Busca todos los docentes que pertenecen a una sucursal específica.
    List<DocenteEntity> findAllBySucursal(SucursalEntity sucursal);

    // Busca docentes cuyo nombre contenga el texto indicado.
    List<DocenteEntity> findByNombreContainingIgnoreCase(String nombre);

    // Busca docentes cuyos apellidos contengan el texto indicado.
    List<DocenteEntity> findByApellidosContainingIgnoreCase(String apellidos);
}
