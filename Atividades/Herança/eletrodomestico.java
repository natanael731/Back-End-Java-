package Eletrodoméstico;

public class eletrodomestico {
	
	private double tensão;
	private String cor;
	private double preço;
	public double getTensão() {
		return tensão;
	
		
		
	}
	public eletrodomestico(double tensão, String cor, double preço) {
		this.tensão = tensão;
		this.cor = cor;
		this.preço = preço;
		
		
	}
	public void setTensão(double tensão) {
		this.tensão = tensão;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	

	

}
