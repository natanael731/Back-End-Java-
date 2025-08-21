package SistemaDeTransporte;

public class Veiculo {
	
	private String modelo;
	private int velmedia;
	
	
	public Veiculo(String modelo, int velmedia) {
		this.modelo = modelo;
		this.velmedia = velmedia;
	}

	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getVelmedia() {
		return velmedia;
	}

	public void setVelmedia(int velmedia) {
		this.velmedia = velmedia;
	}

	public float CalcularTempo(float distancia) {
		double tempo = 100/ velmedia;
		return velmedia;
	
		
	}
	
}
