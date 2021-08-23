//package com.empresa.entregasonline.domain.model;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.data.annotation.Id;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//@Data
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Entity
//@Table(name = "Entrega") // Quando não identificado usa o nome da classe como nome de tabela
//public class Entrega {
//
//	@EqualsAndHashCode.Include
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id", unique=true, nullable=false, precision=10)
//	private Long id;
//
//	@ManyToOne // Muitas entregas para um cliente
//	@JoinColumn(name="Cliente_id", referencedColumnName="Id", nullable=false)
//	private Cliente cliente;
//
//	@Embedded
//	private Destinatario destinatario;
//	
//	private BigDecimal taxa;
//
//	@Enumerated(EnumType.STRING) // Armazenar a string o proprio texto.
//	@Column(name = "status")
//	private StatusEntrega status;
//
//	private LocalDateTime dataPedido;
//	private LocalDateTime dataFinalizacao;
//
//}
