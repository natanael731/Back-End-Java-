package Veiculo;

public class Carro extends Veiculo{

	public Carro(String nome, String cor) {
		super(nome, cor);
		
	}

	@Override 
	public  void iniciar() {
		System.out.println("Carro está iniciando...");
	}
}
