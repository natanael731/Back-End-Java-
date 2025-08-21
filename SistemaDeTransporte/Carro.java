package SistemaDeTransporte;

public class Carro extends Veiculo {

	public Carro(String modelo, int velmedia) {
		super(modelo, velmedia);}
	
		
		@Override
		public float CalcularTempo(float distancia) {
			float velmedia = 80.0f;
			return 100 / velmedia;
			
			
		
	}

	
	}

	
		
	
	
	

	
	


