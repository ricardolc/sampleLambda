package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //lambda();
		nomesReduzidos();
	}

	private static void nomesReduzidos() {


		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 0);
		 
		//Implementa��o tradicional
		for(Integer n: list) {
		   System.out.print(n);
		}
		 
		//Implementa��o com express�es lambda e StreamAPI       
	
	//	list.forEach(n -> System.out.println(n));
		
		list.forEach(n -> System.out.println(n));


		
	}

	private static void lambda() {

		List<String> nomes = Arrays.asList("Lucas", "Rodrigo", "Paulo");
		
		 for(String nome : nomes) {
		     System.out.println(nome);
		 }

		
		 
		 
		 nomes.forEach(nome -> System.out.println(nome));
		
		
	}

}
