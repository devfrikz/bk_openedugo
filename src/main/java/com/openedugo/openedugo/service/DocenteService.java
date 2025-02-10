package com.openedugo.openedugo.service;

import com.openedugo.openedugo.entity.DocenteEntity;
import com.openedugo.openedugo.entity.SucursalEntity;
import java.util.List;
import java.util.Optional;

public interface DocenteService {
    DocenteEntity saveDocente(DocenteEntity docente);
    Optional<DocenteEntity> getDocenteById(Integer id);
    List<DocenteEntity> getAllDocentes();
    DocenteEntity updateDocente(DocenteEntity docente);
    void deleteDocente(Integer id);

    // Métodos de consulta adicionales
    Optional<DocenteEntity> findByNumeroProfesor(String numeroProfesor);
    List<DocenteEntity> findByNombreContaining(String nombre);
    List<DocenteEntity> findByApellidosContaining(String apellido);
    List<DocenteEntity> findBySucursal(SucursalEntity sucursal);
}
