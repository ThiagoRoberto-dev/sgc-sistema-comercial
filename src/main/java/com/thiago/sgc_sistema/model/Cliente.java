package com.thiago.sgc_sistema.model;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = Generat.IDENTITY)
	private Long id;

	private String nome;

	@Column(unique = true)
	private String cpf;

	// getters e setters
}
