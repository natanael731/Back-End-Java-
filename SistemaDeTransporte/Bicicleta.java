package SistemaDeTransporte;

public class Bicicleta extends Veiculo {

	public Bicicleta(String modelo, int velmedia) {
		super(modelo, velmedia); }
		
		@Override
		public float CalcularTempo(float distancia) {
			
			 float velmedia = 20.0f;
			 return 100 / velmedia;
			
			
	}
	
	

}
