package br.com.santander.vinicius.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table("gastos")
public class Gasto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private UUID id;
	private Integer codigoUsuario;
	private String descricao;
	private BigDecimal valor;
	private String data;
	
}
