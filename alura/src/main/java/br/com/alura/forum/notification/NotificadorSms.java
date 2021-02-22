package br.com.alura.forum.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Notificacao(TipoNotificador.SMS)
//@Primary
//@Qualifier(value = "sms")
@Component
public class NotificadorSms implements Notificador{

	@Override
	public void notificar(String mensagem) {
		System.out.println("Notificacao por sms: " + mensagem);
	}

}
