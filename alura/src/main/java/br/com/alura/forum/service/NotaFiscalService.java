package br.com.alura.forum.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
@Service
public class NotaFiscalService {
	
	@EventListener
	public void gerarNotaFiscal(String mensagem) {
		System.out.println("Gerar nota fiscal do item: " + mensagem);
	}

}
