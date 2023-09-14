package br.com.saltoleto.h2r2dbc.controller;

import br.com.saltoleto.h2r2dbc.model.User;
import br.com.saltoleto.h2r2dbc.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping
    public Flux<User> getAllUsers() {
        return userService.listarUsuarios();
    }
}
