package com.openedugo.openedugo.service;

import com.openedugo.openedugo.entity.EstudianteEntity;
import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    EstudianteEntity saveEstudiante(EstudianteEntity estudiante);
    Optional<EstudianteEntity> getEstudianteById(Integer id);
    List<EstudianteEntity> getAllEstudiantes();
    EstudianteEntity updateEstudiante(EstudianteEntity estudiante);
    void deleteEstudiante(Integer id);

    // Métodos de consulta adicionales
    Optional<EstudianteEntity> findByNumeroAlumno(Integer numeroAlumno);
    List<EstudianteEntity> findByApellidosContaining(String apellido);
    List<EstudianteEntity> findByNombresContaining(String nombres);
    List<EstudianteEntity> getAllOrderByApellidos();
}
