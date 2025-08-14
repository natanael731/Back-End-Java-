package Eletrodoméstico;

public class microOndas extends eletrodomestico {
	
	private double capacidade;
	
	public microOndas(double tensão, String cor, double preço,double potencia) {
		super(tensão, cor, preço);
		this.capacidade = capacidade;
		
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	
	
	

}
