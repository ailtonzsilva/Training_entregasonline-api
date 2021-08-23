//package com.empresa.entregasonline.api.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.empresa.entregasonline.domain.model.Entrega;
//import com.empresa.entregasonline.domain.service.SolicitacaoEntregaService;
//
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor // Injeção de repositorios pelo contrutor
//@RestController // Indentificar como controlador rest
//@RequestMapping("/entregas") // Mapeamento base
//public class EntregaController {
//
//	private SolicitacaoEntregaService solicitacaoEntregaService;
//	
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Entrega solicitar(@RequestBody Entrega entrega) { // @RequestBody - Transformar o json em uma entrega
//		return solicitacaoEntregaService.solicitar(entrega);
//	}
//}
