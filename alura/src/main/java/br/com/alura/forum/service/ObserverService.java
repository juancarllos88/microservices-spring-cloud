package br.com.alura.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ObserverService {
	
	@Autowired
	private ApplicationEventPublisher publicador;
	
	public void notificar(String mensagem) {
		publicador.publishEvent(mensagem);
	}

}
