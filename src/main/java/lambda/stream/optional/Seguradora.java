package lambda.stream.optional;

import java.util.Optional;

public class Seguradora {
	private String nome;
	private int id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Seguradora [nome=" + nome + ", id=" + id + "]";
	}

	public Seguradora(String nome) {
	
		this.nome = nome;
	}
	
	public Seguradora() {
	}
	

	//public Optional <String> getNome() { // optional nao pode ser usado na variavel, no retorno de metodo pode
	//	return Optional.ofNullable(nome);
	//}
	
	public String getNome() { // optional nao pode ser usado na variavel, no retorno de metodo pode
		return (nome);
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	

}
