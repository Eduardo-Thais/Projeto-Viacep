package br.senai.cadastroEnderecos.controler;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senai.cadastroEnderecos.dto.DadosEnderecoDTO;

@RestController
public class CEPController {
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public boolean cadastrarEndereco(@RequestBody DadosEnderecoDTO cadastro){
		return true;
		
	}
	
	
}
