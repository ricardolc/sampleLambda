package lambda.stream;

import java.util.List;
import java.util.Arrays;

public class Pessoa {
	private String Nome;
	private int idade;
	private double Salario;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Double.doubleToLongBits(Salario) != Double.doubleToLongBits(other.Salario))
			return false;
		if (idade != other.idade)
			return false;
		return true;
	}

	// Alt + Shift + S   ==> c
	public Pessoa(String nome, int idade, double salario) {
		super();
		Nome = nome;
		this.idade = idade;
		Salario = salario;
	}

	public static List<Pessoa> bancoDePessoas() {
		
		return Arrays.asList(
					new Pessoa ("Ricardo", 37, 1000),
					new Pessoa ("Mara", 24, 1500),
					new Pessoa ("Ravi", 2 , 1500),
					new Pessoa ("Stefani", 13 , 1500),
					new Pessoa ("Josecardo", 15 , 1500),
					new Pessoa ("Ricazefa", 8 , 1500),
					new Pessoa ("Menila", 5 , 1500),
					new Pessoa ("Hanna", 2 , 1500),
					new Pessoa ("Hanna", 2 , 1500)
					);
		
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
    

}
