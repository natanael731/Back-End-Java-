package Livro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Livro l = new Livro();
		
		
		System.out.println("Digite o título do livro: ");
		String titulo = sc.nextLine();
		l.setTitulo(titulo);
		
		System.out.println("Digite o nome do Autor do Livro: ");
		String autor = sc.nextLine();
		l.setAutor(autor);
		
		System.out.println("Digite o número de páginas:");
		int paginas = sc.nextInt();
		l.setPaginas(paginas);
		
		if (paginas < 5) {
			System.err.println("O número de páginas não pode ser menor que 5!!!");
		} else {
		}
		
		System.out.println(l.toString());

	
		
		
		
		

	}

}
