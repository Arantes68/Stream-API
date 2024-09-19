package StreamAPI;

public class ConsumerPessoa {
	
/* ATRIBUTOS */	
    private String nome;
    private int idade;
    
/* CONSTRUTOR */    
    public ConsumerPessoa(String nome, int idade) {
    	this.nome = nome;
    	this.idade = idade;
    }

/* MÉTODOS ESPECIAIS */    
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
    
}
