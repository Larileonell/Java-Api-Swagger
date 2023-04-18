package study.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.web.api.repository.UserRepository;
import study.web.api.model.Usuario;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<Usuario> getUsers() {
        return repository.ListAll();
    }

    @GetMapping("/users/{username}")
    public Usuario GetOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);

    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);

    }
    @PostMapping("/users")
    public void PostUsers(Usuario usuario){
        repository.save(usuario);
    }
}
