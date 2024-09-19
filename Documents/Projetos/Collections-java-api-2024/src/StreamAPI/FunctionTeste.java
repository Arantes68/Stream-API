package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionTeste {

	public static void main(String[] args) {

/* CRIAR UMA LISTA DE NÚMEROS INTEIROS */	
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
/* USAR A FUNCTION(FUNÇÃO) COM EXPRESSÃO LAMBDA PARA DOBRAR TODOS OS NÚMEROS */		
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
/* DOBRAR NÚMEROS USANDO STREAM E ARMAZENÁ-LOS EM OUTRA LISTA */	
		List<Integer> numerosDobrados = numeros.stream() //Cria um Stream da lista de números
				.map(dobrar) // Aplica a função dobrar a cada elemento do Stream. O map transforma cada número da lista original. 
				.collect(Collectors.toList()); //Coleta os resultados transformados e os armazena em uma nova lista chamada numerosDobrados.
		
/* IMPRIMIR A LISTA DE NÚMEROS DOBRADOS */		
		numerosDobrados.forEach(n -> System.out.println(n));
	}

}
