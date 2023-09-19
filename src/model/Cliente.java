package model;

public class Cliente {
	
	public String nome;
	public int numero;

	public Cliente() {
		super();
	}
	
	public Cliente(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numero=" + numero + "]";
	}

	
}
