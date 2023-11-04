package com.picpay.BackEnd.Service;

import com.picpay.BackEnd.domain.user.User;
import com.picpay.BackEnd.domain.user.UserType;
import com.picpay.BackEnd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;


    public void ValidateTransaction(User sender, BigDecimal amount) throws Exception{
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuario do tipo lojista nao esta autorizado para realizar transacao");
        }
        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Usuario nao tem saldo suficiente");
        }
    }
    public User findUserById(Long id) throws Exception{
       return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuario nao encontrado"));
    }
    public void saveUser(User user){
        this.repository.save(user);
    }
}
