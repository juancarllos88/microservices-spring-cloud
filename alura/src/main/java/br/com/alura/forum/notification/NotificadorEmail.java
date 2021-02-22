package br.com.alura.forum.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Notificacao(TipoNotificador.EMAIL)
//@Qualifier(value = "email")
@Component
public class NotificadorEmail implements Notificador{

	@Override
	public void notificar(String mensagem) {
		System.out.println("Notificacao por email: " + mensagem);
	}

}
