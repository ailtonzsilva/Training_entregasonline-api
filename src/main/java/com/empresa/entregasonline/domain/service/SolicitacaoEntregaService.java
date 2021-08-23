//package com.empresa.entregasonline.domain.service;
//
//import java.time.LocalDateTime;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.empresa.entregasonline.domain.model.Entrega;
//import com.empresa.entregasonline.domain.model.StatusEntrega;
//import com.empresa.entregasonline.repository.EntregaRepository;
//
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor // Injeção de repositorios pelo contrutor
//@Service	// Componente com semantica de serviço
//public class SolicitacaoEntregaService {
//
//	// Injetar o repositorio
//	private EntregaRepository entregaRepository;
//
//	@Transactional  // Executar dentro de uma transação
//	public Entrega solicitar(Entrega entrega) {
//		
//		entrega.setStatus(StatusEntrega.PENDETENTE);
//		entrega.setDataPedido(LocalDateTime.now());
//		
//		
//		return entregaRepository.save(entrega);
//	}
//	
//	
//}
