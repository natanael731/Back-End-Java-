package ValidaçãoIdade;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa() {

		
		
		
		
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
		if(idade > 0) {
			this.idade = idade;
			System.out.println("Idade :" + idade);
			System.out.println("Nome:" + nome);
			
		}else {
			System.err.println("Idade Inaválidade");
			
		}
	}

	public String getNome() {
		return nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	
	


}
