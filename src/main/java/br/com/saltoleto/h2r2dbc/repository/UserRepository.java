package br.com.saltoleto.h2r2dbc.repository;

import br.com.saltoleto.h2r2dbc.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
