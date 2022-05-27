package com.algaworks.algalog.domain.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


//Esta anotação ira gerar automaticamente os Equal e Hash code apenas de qual especificar como esta no id
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
//@Table(name  = "")
public class Cliente {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(name = "nome_cliente")
	private String nome;
	
	private String email;
	
	@Column(name = "fone")
	private String telefone;




}
