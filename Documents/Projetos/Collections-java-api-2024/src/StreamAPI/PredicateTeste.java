package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeste {

	public static void main(String[] args) {

/* CRIAR UMA LISTA DE PALAVRAS */
		List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
		
/* CRIAR UM PREDICATE QUE VERIFICAR SE A PALAVRA TEM MAIS DE 5 CARACTERES */
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
/* USAR O STREAM PARA FILTRAR AS PALAVRAS COM MAIS DE 5 CARACTERES E, EM SEGUIDA,
 * IMPRIMIR CADA PALAVRA QUE PASSOU NO FILTRO */
        palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);

	}

}
