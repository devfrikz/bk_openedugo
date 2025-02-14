package com.openedugo.openedugo.repository;

import com.openedugo.openedugo.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    // Busca un usuario por su nombre de usuario.
    Optional<UsuarioEntity> findByUsername(String username);

    // Indica si existe un usuario con el nombre de usuario dado.
    boolean existsByUsername(String username);

    // Busca un usuario por su correo electrónico.
    Optional<UsuarioEntity> findByEmail(String email);

    // Busca usuarios cuyo nombre contenga el texto indicado (sin distinguir mayúsculas/minúsculas).
    List<UsuarioEntity> findByNombreContainingIgnoreCase(String nombre);

    // Busca usuarios cuyo apellido contenga el texto indicado (sin distinguir mayúsculas/minúsculas).
    List<UsuarioEntity> findByApellidoContainingIgnoreCase(String apellido);

}

