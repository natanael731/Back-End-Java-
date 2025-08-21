package SistemaDeTransporte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Bicicleta b = new Bicicleta("Monark", 20);
		Carro c = new Carro("Uno", 80);
		Onibus o = new Onibus("Mercedez", 60, 10 );
		
		 Veiculo[] veiculos = {o, c, b};
		
		 for ( Veiculo v : veiculos) {
			 float tempo = v.CalcularTempo(100);
			 
			 System.out.println(v.getModelo() + " leva " + tempo + " horas pra percorrer " + 100 + " km ");
			System.out.println();
		}
		 
		
	
		
		
		
		
	

	}

}
