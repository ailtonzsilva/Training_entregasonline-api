package com.empresa.entregasonline.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.entregasonline.domain.exception.NegocioException;
import com.empresa.entregasonline.domain.model.Cliente;
import com.empresa.entregasonline.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service // Componente spring com semantica de serviço
public class CatalogoClienteService {

	private ClienteRepository clienteRepository;

	@Transactional // Executar dentro de uma transação
	public Cliente salvar(Cliente cliente) {
		boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
				.stream()
				.anyMatch(clienteExistente -> !clienteExistente.equals(cliente));
		
		if(emailEmUso) {
			throw new NegocioException("Já existe um cliente cadastrado com este e-mail");
		}
		
		return clienteRepository.save(cliente);
	}

	@Transactional // Executar dentro de uma transação
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}	
	
	
}
