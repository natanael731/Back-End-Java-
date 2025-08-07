package PrecoProtegido;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto() {
		
		
	}
	
	  public void aplicarDesconto(double percentual) {
		    double desconto = this.preco * (percentual / 100);

		    double novoPreco = this.preco - desconto;

		    if (novoPreco < 0) {
		        System.err.println("O preço não pode ser menor que 0");
		    } else {
		    	
		        this.preco = novoPreco;
		    }
		 
		 
		 
		 
	 }
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
