package com.openedugo.openedugo.repository;

import com.openedugo.openedugo.entity.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<SucursalEntity, Integer> {
    // Puedes agregar métodos de consulta personalizados si lo necesitas, por ejemplo:
    // Optional<SucursalEntity> findByNombreSucursal(String nombre);
}
