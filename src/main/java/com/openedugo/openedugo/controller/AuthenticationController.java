package com.openedugo.openedugo.controller;

import com.openedugo.openedugo.dto.LoginRequest;
import com.openedugo.openedugo.dto.LoginResponse;
import com.openedugo.openedugo.dto.RegisterRequest;
import com.openedugo.openedugo.entity.RoleEntity;
import com.openedugo.openedugo.entity.SucursalEntity;
import com.openedugo.openedugo.entity.UsuarioEntity;

import com.openedugo.openedugo.repository.SucursalRepository;
import com.openedugo.openedugo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final UsuarioService usuarioService;
    private final BCryptPasswordEncoder passwordEncoder;
    private final SucursalRepository sucursalRepository;

    @Autowired
    public AuthenticationController(UsuarioService usuarioService,
                                    BCryptPasswordEncoder passwordEncoder,
                                    SucursalRepository sucursalRepository) {
        this.usuarioService = usuarioService;
        this.passwordEncoder = passwordEncoder;
        this.sucursalRepository = sucursalRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Buscar el usuario por username
        var usuarioOpt = usuarioService.findByUsername(loginRequest.getUsername());
        if (usuarioOpt.isPresent()) {
            UsuarioEntity usuario = usuarioOpt.get();
            // Comparar contraseñas usando BCrypt
            if (passwordEncoder.matches(loginRequest.getPassword(), usuario.getPassword())) {
                // Generar token (por ahora, un token dummy)
                String token = "dummy-token";
                LoginResponse response = new LoginResponse(token, "Login successful");
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.status(401).body("Contraseña incorrecta");
            }
        } else {
            return ResponseEntity.status(404).body("Usuario no encontrado");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        // Verificar si ya existe un usuario con el mismo username
        if (usuarioService.findByUsername(registerRequest.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("El nombre de usuario ya está en uso");
        }

        // Crear un nuevo objeto UsuarioEntity a partir del RegisterRequest
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setUsername(registerRequest.getUsername());
        usuario.setPassword(registerRequest.getPassword()); // Se encripta en UsuarioServiceImpl
        usuario.setEmail(registerRequest.getEmail());
        usuario.setNombre(registerRequest.getNombre());
        usuario.setApellido(registerRequest.getApellido());

        // Asignar un rol por defecto (asegúrate de que exista en la tabla 'roles')
        RoleEntity role = new RoleEntity();
        role.setRoleId(1); // O el ID que necesites
        usuario.setRole(role);

        // Asignar la sucursal (si se envía en el RegisterRequest):
        if (registerRequest.getSucursalId() != null) {
            // Cargar la sucursal desde la BD para asegurar que existe
            SucursalEntity sucursal = sucursalRepository.findById(registerRequest.getSucursalId())
                    .orElseThrow(() -> new RuntimeException(
                            "No se encontró la sucursal con ID: " + registerRequest.getSucursalId()
                    ));
            usuario.setSucursal(sucursal);
        }
        // De lo contrario, si no se pasa sucursalId, puedes omitir esta parte
        // o asignar una sucursal por defecto, según tu lógica de negocio.

        // Guardar el nuevo usuario
        UsuarioEntity savedUser = usuarioService.saveUsuario(usuario);
        return ResponseEntity.ok(savedUser);
    }
}
