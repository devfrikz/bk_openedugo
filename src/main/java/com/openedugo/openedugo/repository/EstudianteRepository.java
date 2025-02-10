package com.openedugo.openedugo.repository;

import com.openedugo.openedugo.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Integer> {

    // Busca un estudiante por su número de alumno.
    Optional<EstudianteEntity> findByNumeroAlumno(Integer numeroAlumno);

    // Busca estudiantes cuyo apellido contenga el texto indicado.
    List<EstudianteEntity> findByApellidosContainingIgnoreCase(String apellido);

    // Busca estudiantes cuyo nombre contenga el texto indicado.
    List<EstudianteEntity> findByNombresContainingIgnoreCase(String nombres);

    // Retorna todos los estudiantes ordenados por apellido de forma ascendente.
    List<EstudianteEntity> findAllByOrderByApellidosAsc();
}
