package PrecoProtegido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Digite o nome do produto");
		String nome = sc.nextLine();
		p.setNome(nome);
		
		System.out.println("Digite o valor do produto: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o perentual de desconto(%)");
		double percentual = sc.nextDouble();
		p.setPreco(valor);
		
		sc.nextLine();
		
		
		p.aplicarDesconto(percentual);
		
		System.out.println("Nome do produto: " + p.getNome());
		System.out.println("Valor com desconto: " + p.getPreco());
		
		
		sc.close();

	}

}
