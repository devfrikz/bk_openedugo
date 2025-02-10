package com.openedugo.openedugo.service.impl;

import com.openedugo.openedugo.entity.EstudianteEntity;
import com.openedugo.openedugo.repository.EstudianteRepository;
import com.openedugo.openedugo.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public EstudianteEntity saveEstudiante(EstudianteEntity estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Optional<EstudianteEntity> getEstudianteById(Integer id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public List<EstudianteEntity> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public EstudianteEntity updateEstudiante(EstudianteEntity estudiante) {
        if(estudiante.getEstudianteId() == null || !estudianteRepository.existsById(estudiante.getEstudianteId())) {
            throw new RuntimeException("Estudiante no encontrado");
        }
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Integer id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public Optional<EstudianteEntity> findByNumeroAlumno(Integer numeroAlumno) {
        return estudianteRepository.findByNumeroAlumno(numeroAlumno);
    }

    @Override
    public List<EstudianteEntity> findByApellidosContaining(String apellido) {
        return estudianteRepository.findByApellidosContainingIgnoreCase(apellido);
    }

    @Override
    public List<EstudianteEntity> findByNombresContaining(String nombres) {
        return estudianteRepository.findByNombresContainingIgnoreCase(nombres);
    }

    @Override
    public List<EstudianteEntity> getAllOrderByApellidos() {
        return estudianteRepository.findAllByOrderByApellidosAsc();
    }
}
