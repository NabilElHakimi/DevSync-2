package org.example.DevSync2.service;

import org.example.DevSync2.entity.Token;
import org.example.DevSync2.repository.TokenRepository;

public class TokenService {

    private final TokenRepository tokenRepository = new TokenRepository();

    public boolean save(Token token) {
        return tokenRepository.save(token);
    }



}
