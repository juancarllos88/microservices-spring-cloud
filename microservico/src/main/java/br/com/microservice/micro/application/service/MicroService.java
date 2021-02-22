package br.com.microservice.micro.application.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MicroService {
	private static final Logger log = LoggerFactory.getLogger(MicroService.class);
	
	@HystrixCommand(fallbackMethod="fallbackMethod", threadPoolKey= "chamarServicoThreadPool")
	public String chamarServico() {
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//		}
		log.info("FAZENDO CHAMADA");
		Random tipo = new Random();
		return "chamada ok " + tipo.nextInt(100);
		
	}
	
	public String fallbackMethod() {
		return "Hystrix Funcionando...";
	}

	@HystrixCommand(threadPoolKey="chamarServicoGetThreadPool")
	public String chamarServicoGet() {
		return "servicoget";
	}

}
