package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.forum.service.NotificacaoService;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public NotificacaoService notificacaoService() {
		return new NotificacaoService();
		
	}
}
