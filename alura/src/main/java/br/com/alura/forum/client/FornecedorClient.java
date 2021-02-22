package br.com.alura.forum.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.dto.ProdutoResponseTO;

@FeignClient(name = "fornecedor", path = "/produto")
public interface FornecedorClient {
	
	@GetMapping(path = "/{estado}")
	public List<ProdutoResponseTO> getProdutosPorEstado(@PathVariable("estado") String estado);

}
