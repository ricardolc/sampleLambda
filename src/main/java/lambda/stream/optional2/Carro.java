package lambda.stream.optional2;

import lambda.stream.optional.Seguradora;

public class Carro {
	private Seguradora2 seguradora;
	private String nome;

	public String getNomeSeguradora(Pessoa p) {
		String retorno = "";
		
		if (p != null) {
			Carro carro = p.getCarro();

			if (carro != null) {
				Seguradora2 s = carro.getSeguradora();

				if (s != null) {
					retorno =  s.getNome();
				}
			}
		}

		return retorno;
	}

	public Seguradora2 getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora2 seguradora) {
		this.seguradora = seguradora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
