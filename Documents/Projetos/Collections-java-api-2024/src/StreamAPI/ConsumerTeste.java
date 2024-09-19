package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTeste {
    public static void main(String[] args) {
    	
/* LISTA DE PESSOAS COM ALGUMAS INSTÂNCIAS DA CLASSE Pessoa */    
    	
        List<ConsumerPessoa> pessoas = Arrays.asList(
            new ConsumerPessoa("Marcos", 28),
            new ConsumerPessoa("Lucas", 35),
            new ConsumerPessoa("João", 5)
        );

/* imprimirPessoa É UM Consumer<Pessoa> QUE IMPRIME O NOME E A IDADE DE CADA PESSOA */
        Consumer<ConsumerPessoa> imprimirPessoa = pessoa -> 
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());

/* USADO forEach PARA APLICAR O Consumer EM CADA ELEMENTO DA LISTA pessoas. */
        pessoas.forEach(imprimirPessoa);
    }
}