package br.com.alura.forum.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@FeignClient(name="micro", url="http://localhost:8082/micro/")
@FeignClient(name = "microservico", path = "/micro")
public interface MicroClient {
	
	@GetMapping("/teste")
	@ResponseBody
	String teste();

}
