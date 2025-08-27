package CachePessoa;

public class Pessoa {
	
	private int idade;
	private String nome;
	private int id;
	
	
	
	
	public Pessoa(int idade, String nome, int id) {
		this.idade = idade;
		this.nome = nome;
		this.id = id;

		
		
	}
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + ", id=" + id + "]";
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
