package com.empresa.entregasonline.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Table(name = "Entrega") // Quando não identificado usa o nome da classe como nome de tabela
@Embeddable
public class Destinatario {

	@Column(name = "destinatario_nome")
	@Size(max = 60)
	private String nome;
	
	@Column(name = "destinatario_logradouro")
	@Size(max = 255)
	private String logradouro;
	
	@Column(name = "destinatario_numero")
	@Size(max = 30)
	private String numero;
	
	@Column(name = "destinatario_complemento")
	@Size(max = 60)
	private String complemento;
	
	@Column(name = "destinatario_bairro")
	@Size(max = 30)
	private String bairro;
}
