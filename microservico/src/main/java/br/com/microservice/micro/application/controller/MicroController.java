package br.com.microservice.micro.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.microservice.micro.application.service.MicroService;

@RequestMapping("/micro")
@Controller
public class MicroController {
	
	private static final Logger log = LoggerFactory.getLogger(MicroController.class);
	
	@Autowired
	private MicroService service;
	
	@GetMapping("/teste")
	@ResponseBody
	public String teste() {
		log.info("REQUEST CHEGOU NO MICROCONTROLLER");
		return service.chamarServico();	
	}
	
	@GetMapping("/teste2")
	@ResponseBody
	public String teste2() {
		return service.chamarServicoGet();
	}
	
}
