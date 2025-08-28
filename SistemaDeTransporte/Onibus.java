package SistemaDeTransporte;

public class Onibus extends Veiculo{
	
	private int Paradas;

  public Onibus(String modelo, int velmedia, int paradas) {
		super(modelo, velmedia);
		this.Paradas = Paradas;
		
  }
  
		public int getParadas() {
			return Paradas;
		}
		public void setParadas(int paradas) {
			Paradas = paradas;
		}
	

		
		@Override
		public float CalcularTempo(float distancia) {
			float velocidade = 60.0f;
			float tempo = 100 / getVelmedia();
			float tempoParadas = (float) ((Paradas * 15.0f) / 80.0f);
			return tempo + tempoParadas;
			
	}
	}

