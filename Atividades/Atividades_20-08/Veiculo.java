package Veiculo;

public class Veiculo {
	
	private String Nome;
	private String Cor;
	public Veiculo(String nome, String cor) {
		Nome = nome;
		Cor = cor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	
	public  void iniciar() {
		System.out.println("Veiculo esta iniciando...");
	}

}
