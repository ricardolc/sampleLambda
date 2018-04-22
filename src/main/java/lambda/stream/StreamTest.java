package lambda.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	// Coleções = guardo dados de transação
	// Stream, processo dados de transação
	// podem retornar eles mesmos - pipeline - builder

	public static void main(String[] args) {
		// Obter os tres primeiros nomes das pessoas com menos de 25 anos
		// ordenados pelo nome

		java8();
	}

	private static void java7() {

		List<Pessoa> pessoas = Pessoa.bancoDePessoas();

		// ordenando
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});

		pessoas.forEach(n -> System.out.println(n.getNome()));

	}

	private static void java8() {

		

		// ordenando
		// collections, guardados em algum local, ex na memória 
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		
		Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));

		//pessoas.forEach(n -> System.out.println(n.getNome()));
		
		// espahados no tempo Streams, em tempo real
		
		List<String> nomes2 = pessoas
				.stream()   // Intermediate
				.filter(p -> p.getIdade() < 5) // Intermediate
				.distinct()
				.sorted(Comparator.comparing(Pessoa::getNome)) // Intermediate
				.limit(3) // Intermediate
				.skip(1)

				.map(Pessoa::getNome)  // retirando os nomes // Intermediate
				.collect(Collectors.toList()); // Terminal
		
		System.out.println(nomes2);
		
      	long contador = 	pessoas
		.stream()   // Intermediate
		.filter(p -> p.getIdade() < 5) // Intermediate
		.distinct()
		.limit(3) // Intermediate
		.skip(1)
		.map(Pessoa::getNome)  // retirando os nomes // Intermediate
		.count();
      	
      	System.out.println(contador);
		
				
		// intermediate e Terminal		
				

	}

}
