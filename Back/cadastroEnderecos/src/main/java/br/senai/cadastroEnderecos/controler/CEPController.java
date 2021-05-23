package br.senai.cadastroEnderecos.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senai.cadastroEnderecos.model.Endereco;
import br.senai.cadastroEnderecos.repository.EnderecoRepository;

@RestController
public class CEPController {
	
	@Autowired
	private EnderecoRepository er;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public boolean cadastrarEndereco(@RequestBody Endereco cadastro){
		
		er.save(cadastro);
		
		return true;
		
	}
	
	
}
