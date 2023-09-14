package br.com.saltoleto.h2r2dbc.service;

import br.com.saltoleto.h2r2dbc.model.User;
import br.com.saltoleto.h2r2dbc.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Flux<User> listarUsuarios() {
        return userRepository.findAll();
    }

}
