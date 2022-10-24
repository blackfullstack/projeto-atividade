package com.example.demo.controllerzarparbahia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Contato;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ContatoRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")

public class ControllerContato {
	
	@Autowired
	private ContatoRepository contatoRepository;
	//Pegar todos os funcionarios
	@GetMapping("/contatos")
	public List<Contato> getAllcontatos() {
	return contatoRepository.findAll();
	}
	//Pegar um funcionario usando seu ID
	@GetMapping("/contatos/{idcadastro}")
	public ResponseEntity<Contato> getContatoById(@PathVariable Long idcadastro) {
	Contato contato = contatoRepository.findById(idcadastro).orElseThrow(() -> new ResourceNotFoundException("Contato nao existe com o id : " + idcadastro));
	return ResponseEntity.ok(contato);
	}
	//Criar um novo funcionario
	@PostMapping("/contatos")
	public Contato createContato(@RequestBody Contato contato) {
	return contatoRepository.save(contato);
	}
	//Alterar um funcionario
	@PutMapping("/contatos/{idcadastro}")
	public ResponseEntity<Contato> updateContato(@PathVariable Long idcadastro, @RequestBody Contato contatoDetails) {
		Contato contato = contatoRepository.findById(idcadastro).orElseThrow(() -> new ResourceNotFoundException("Contato nao existe com idcadastro :" + idcadastro));
		contato.setNome(contatoDetails.getNome());
		contato.setNascimento(contatoDetails.getNascimento());
		contato.setCpf(contatoDetails.getCpf());
		contato.setCep(contatoDetails.getCep());
		contato.setCelular(contatoDetails.getCelular());
		contato.setEmail(contatoDetails.getEmail());
		contato.setSenha(contatoDetails.getSenha());
		
		
		
	Contato updatedContato = contatoRepository.save(contato);
	return ResponseEntity.ok(updatedContato);
	}
	//Deletar um funcionario
	@DeleteMapping("/contatos/{idcadastro}")
	public ResponseEntity<Map<String, Boolean>> deleteContato (@PathVariable Long idcadastro) {
		Contato contato = contatoRepository.findById(idcadastro).orElseThrow(() -> new ResourceNotFoundException("Cadastro nao existe com id :" + idcadastro));
	contatoRepository.delete(contato);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deletado", Boolean.TRUE);
	return ResponseEntity.ok(response);
	}
	}



