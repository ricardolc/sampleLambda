	package lambda.stream.optional;

import java.util.Optional;

import lambda.stream.optional.Carro;

public class Pessoa {
	
	private Carro carro;
	private String nome;
	
	public Pessoa(Carro carro, String nome) {
		this.carro = carro;
		this.nome = nome;
	}
	
	public Pessoa(String nome) {

		this.nome = nome;
	}
	public Optional<Carro> getCarro() {
		return Optional.ofNullable(carro); //nao tenho certeza se vai ter
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
