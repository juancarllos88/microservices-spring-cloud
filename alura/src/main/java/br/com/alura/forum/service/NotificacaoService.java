package br.com.alura.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;

import br.com.alura.forum.notification.Notificacao;
import br.com.alura.forum.notification.Notificador;
import br.com.alura.forum.notification.TipoNotificador;

//@Service
public class NotificacaoService {
	
	@Autowired
	@Notificacao(TipoNotificador.SMS)
	//@Qualifier(value = "email")
	//private List<Notificador> notificador;
	private Notificador notificador;
	
	
	
	public NotificacaoService() {
		System.out.println("Criando NotificacaoService");
	}


	@EventListener
	public void notificar(String mensagem) {
		//notificador.forEach( notitication -> notitication.notificar(mensagem));
		notificador.notificar(mensagem);
	}

}
