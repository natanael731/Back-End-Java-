package Eletrodoméstico;

public class batedeira extends eletrodomestico {
	
	private double potencia;

	public batedeira(double tensão, String cor, double preço,double potencia) {
		super(tensão, cor, preço);
		this.potencia = potencia;
		
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
