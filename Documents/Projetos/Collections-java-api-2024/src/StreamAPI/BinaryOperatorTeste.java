package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorTeste {

	public static void main(String[] args) {
       
/* CRIAR UMA LISTA DE NÚMEROS INTEIROS */		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
/* USAR O BINARYOPERATOR COM EXPRESSÃO LAMBDA PARA SOMAR DOIS NÚMEROS INTEIROS */
		BinaryOperator<Integer> somar = Integer::sum;
		
/* USAR O BINARYOPERATOR PARA SOMAR TODOS OS NÚMEROS NO STREAM */
		int resultado = numeros.stream()
				.reduce(0, Integer::sum);
		
/* IMPRIMIR O RESULTADO DA SOMA */
		System.out.println("A soma dos números é: " + resultado);
	}
}

/* OUTRAS OPERAÇÕES NO STREAM: 
 * SOMA: SUM
 * SUBTRAÇÃO: SUBTRACT
 * MULTIPLICAÇÃO: MULTIPLY
 * DIVISÃO: DIVIDE
 */
 */