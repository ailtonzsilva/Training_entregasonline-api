package com.empresa.entregasonline.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entregasonline.domain.model.Cliente;
import com.empresa.entregasonline.domain.service.CatalogoClienteService;
import com.empresa.entregasonline.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController // Identificação de componente spring capaz de tratar requisições http
@RequestMapping("/clientes")
public class ClienteController {

	private ClienteRepository clienteRepository;
	
	private CatalogoClienteService catalogoClienteService;

	@GetMapping // Mapeamento do método
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
		return clienteRepository.findById(clienteId).map(cliente -> ResponseEntity.ok(cliente))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return catalogoClienteService.salvar(cliente);
	}

	@PutMapping("/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteId, @RequestBody Cliente cliente) {

		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}

		cliente.setId(clienteId);
		cliente = catalogoClienteService.salvar(cliente);

		return ResponseEntity.ok(cliente);

	}
	
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Void> remover(@PathVariable Long clienteId) {
		
		// Não existe 404
		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}		
		
		catalogoClienteService.excluir(clienteId);

		// Existe 204 - Sucesso
		return ResponseEntity.noContent().build();
		
	}	
	

}
