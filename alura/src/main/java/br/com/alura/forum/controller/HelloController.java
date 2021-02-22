package br.com.alura.forum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.client.FornecedorClient;
import br.com.alura.forum.client.MicroClient;
import br.com.alura.forum.dto.ProdutoResponseTO;
import br.com.alura.forum.service.ObserverService;

@Controller
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private ObserverService service;
	
	@Autowired
	private MicroClient micro;
	
	@Autowired
	private FornecedorClient fornecedor;
	
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		service.notificar("hb20x");
		//System.out.println(micro.teste());
		log.info("Request para ProdutoController");
		List<ProdutoResponseTO> produtosPorEstado = fornecedor.getProdutosPorEstado("pb");
		produtosPorEstado.forEach(produto->{
			System.out.println(produto.getNome());
			System.out.println(produto.getPreco());
		});
		return "Hello World!";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello2() {
		log.info("Request para MicroController");
		return micro.teste();
	}

}
