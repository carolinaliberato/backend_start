package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GeneroDTO {

	
	private Long id;
	
	private String descricao;
	
	private LocalDateTime dataCriacao;
	
	private LocalDateTime dataAlteracao;
}
