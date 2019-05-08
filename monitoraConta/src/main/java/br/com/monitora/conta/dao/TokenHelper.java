package br.com.monitora.conta.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.monitora.conta.email.Token;

@Component
public class TokenHelper {
	@Autowired
	private TokenDao dao;
	public Token generateFrom(String email) {
		Token token = new Token(email);
		dao.save(token);
		return token;
	}
	public Optional<Token> getTokenFrom(String uuid){
		return dao.findByUuid(uuid);
	}
	
}
