package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierTeste {
    public static void main(String[] args) {
    	
/* CRIANDO UM SUPPLIER QUE GERA NÚMEROS INTEIROS ALEATÓRIOS ENTRE 1 e 100 */
        Supplier<Integer> randomNumberGerar = () -> new Random().nextInt(100) + 1;

/* CRIANDO UM SCANNER PARA LER A ENTRADA DO USUÁRIO */
        Scanner scan = new Scanner(System.in);

/* PERGUNTANDO AO USUÁRIO QUANTOS NÚMEROS ALEATÓRIOS DESEJA GERAR */
        System.out.println();
        System.out.println();
        System.out.print("Quantos números aleatórios você deseja gerar? ");
        int count = scan.nextInt();

/* CRIANDO UMA LISTA PARA ARMAZENAR OS NÚMEROS GERADOS */   
        List<Integer> randomNumbers = new ArrayList<>();

/* GERANDO NÚMEROS ALEATÓRIOS E ADICIONANDO À LISTA */        
        for (int i = 0; i < count; i++) {
            randomNumbers.add(randomNumberGerar.get());
        }

/* EXIBINDO OS NÚMEROS GERADOS COM EXPRESSÃO LAMBDA */
        System.out.println();
        System.out.println();
        System.out.println("Números aleatórios gerados: ");
        randomNumbers.forEach(num -> System.out.print(num + " "));

/* FECHANDO O SCANNER*/
        scan.close();
    }
}
