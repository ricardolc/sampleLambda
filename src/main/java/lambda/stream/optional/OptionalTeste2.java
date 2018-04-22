package lambda.stream.optional;

import java.util.Optional;

public class OptionalTeste2 {
    // https://www.youtube.com/watch?v=N6Dbpxxzpvk&t=158s
	
	public static void main(String[] args) {
	//	Seguradora s = new Seguradora (null);
	//	System.out.println(obterNomeSeguradoraOptional(null));
		
		
		Seguradora seguradora = new Seguradora ("Dev Dojo seguros");
		
		//Carro carro = new Carro(seguradora, "Audi");
		Carro carro = new Carro(seguradora, "Audi");
		Pessoa pessoa = new Pessoa(carro, "Carlos");
		
		//pessoa = null;
		obterNomeSeguradora(Optional.ofNullable(pessoa));
		
		
		
		//obterNomeSeguradora()

		
	}
	
	
	public static String obterNomeSeguradora(Optional<Pessoa> p) {
		
		
		// obtendo o mesmo resultado da classe Carro, sem os nulls
		System.out.println(p
				.flatMap(Pessoa::getCarro)
				.flatMap(Carro::getSeguradora)
				.map(Seguradora::getNome).orElse("Nao existe seguradora")
				);
		return "";
		
	}
	
	
	//private static String obterNomeSeguradoraOptional(Seguradora seguradora) {
	//	System.out.println( Optional.ofNullable(seguradora)
	//			.flatMap(Seguradora::getNome)
	//			.orElse("Outro Nome")
	//			);           // map, servirá para retirar o valor de alguma coisa
	//			return "";
	//}
	
	//private static String obterNomeSeguradora(Seguradora seguradora) {
	//	String nome = null;
		
	//	if (seguradora.getNome() != null)
	//		nome = seguradora.getNome();
		
		
	//	return nome;
		
		
	//}
}
