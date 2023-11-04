package com.picpay.BackEnd.repository;

import com.picpay.BackEnd.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserByDocument(String document);  //Buscar os usuarios pelo documento
    //Opticional nao será sempre que ira retornar o usuario
    Optional<User> findUserById(Long id);


}
