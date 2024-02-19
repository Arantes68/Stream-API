package Principal;

public class Pratica {

	public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.setNumConta(29937);
      p1.setDono("Marcos Vinicius de Lima Arantes");
      p1.abrirConta("CC");
      
      ContaBanco p2 = new ContaBanco();
      p2.setNumConta(30033);
      p2.setDono("Marcia da Silva Melo");
      p2.abrirConta("CP");
      
      p1.depositar(100);
      p2.depositar(500);
      

      p1.sacar(150);
      
      p1.fecharConta(null);
      
      p1.estadoAtual();
      p2.estadoAtual();
	}
}
