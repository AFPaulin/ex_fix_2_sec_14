package entities;

public abstract class Pessoa {

	// Atributos
	private String nome;
	private Double rendaAnual;
	
	// Construtores
	public Pessoa () {
	}

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	// Metodo abstrato
	
	public abstract double imposto();
	
	public String toString() {
		return nome + ": $ " + String.format("%.2f", imposto()); 
	}
	
	
}
