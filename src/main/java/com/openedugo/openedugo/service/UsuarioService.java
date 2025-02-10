package com.openedugo.openedugo.service;

import com.openedugo.openedugo.entity.UsuarioEntity;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    // Crea o guarda un nuevo usuario
    UsuarioEntity saveUsuario(UsuarioEntity usuario);

    // Obtiene un usuario por su ID
    Optional<UsuarioEntity> getUsuarioById(Integer id);

    // Retorna todos los usuarios
    List<UsuarioEntity> getAllUsuarios();

    // Actualiza la información de un usuario
    UsuarioEntity updateUsuario(UsuarioEntity usuario);

    // Elimina un usuario por su ID
    void deleteUsuario(Integer id);

    // Métodos de consulta adicionales
    Optional<UsuarioEntity> findByUsername(String username);
}
