package org.example.DevSync2.service;

import org.example.DevSync2.entity.Token;
import org.example.DevSync2.repository.TokenRepository;

import java.util.List;

public class TokenService {

    private final TokenRepository tokenRepository = new TokenRepository();

    public boolean save(Token token) {
        return tokenRepository.save(token);
    }


    public boolean update(Token token) {
        return tokenRepository.update(token);
    }

    public boolean delete(Token token) {
        return tokenRepository.delete(token);
    }

    public List<Token> findAll() {
        return tokenRepository.findAll();
    }

    public Token findById(Long id) {
        return tokenRepository.findById(id);
    }




}
