package com.thiago.sgc_sistema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false)
	private Venda produto; // Nota: No seu diagrama é associado a um Produto

	private Integer quantidade;
	private Double total;

	// Método para calcular o total automaticamente (Regra de Negócio)
	public void calcularTotal(Double precoProduto) {
		this.total = this.quantidade * precoProduto;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venda getProduto() {
		return produto;
	}

	public void setProduto(Venda produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}