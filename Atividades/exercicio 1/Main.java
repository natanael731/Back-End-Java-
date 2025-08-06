package ValidaçãoIdade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    Pessoa p = new Pessoa(); 
	    
	    System.out.println("Defina um nome:");
	    p.setNome(sc.nextLine());
	    
	    System.out.println("Defina uma idade:");
	    p.setIdade(sc.nextInt());	   

	}

}
