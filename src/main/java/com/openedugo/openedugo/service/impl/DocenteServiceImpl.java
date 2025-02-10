package com.openedugo.openedugo.service.impl;

import com.openedugo.openedugo.entity.DocenteEntity;
import com.openedugo.openedugo.entity.SucursalEntity;
import com.openedugo.openedugo.repository.DocenteRepository;
import com.openedugo.openedugo.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;

    @Autowired
    public DocenteServiceImpl(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    @Override
    public DocenteEntity saveDocente(DocenteEntity docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Optional<DocenteEntity> getDocenteById(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public List<DocenteEntity> getAllDocentes() {
        return docenteRepository.findAll();
    }

    @Override
    public DocenteEntity updateDocente(DocenteEntity docente) {
        if(docente.getDocenteId() == null || !docenteRepository.existsById(docente.getDocenteId())) {
            throw new RuntimeException("Docente no encontrado");
        }
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteDocente(Integer id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public Optional<DocenteEntity> findByNumeroProfesor(String numeroProfesor) {
        return docenteRepository.findByNumeroProfesor(numeroProfesor);
    }

    @Override
    public List<DocenteEntity> findByNombreContaining(String nombre) {
        return docenteRepository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<DocenteEntity> findByApellidosContaining(String apellido) {
        return docenteRepository.findByApellidosContainingIgnoreCase(apellido);
    }

    @Override
    public List<DocenteEntity> findBySucursal(SucursalEntity sucursal) {
        return docenteRepository.findAllBySucursal(sucursal);
    }
}
