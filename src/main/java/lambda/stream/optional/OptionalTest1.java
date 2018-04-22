package lambda.stream.optional;

import java.util.Optional;

public class OptionalTest1 {

	private String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		semOptional();
		comOptional();

	}

	private static void comOptional() {
	
		OptionalTest1 ot =  new OptionalTest1();
		
		if (ot.nome!= null)
		    System.out.println(ot.nome.toString().toUpperCase());
		
		
		
	}

	private static void semOptional() {

		String nome;
		OptionalTest1 ot =  new OptionalTest1();
		
		
		Optional<String> o3 = Optional.ofNullable(ot.nome);
	
		if (o3.isPresent())
	   	   System.out.println(o3);
		
		System.out.println(o3.orElse("-"));
		
		
	}

}
