package Livro;

public class Livro {
	
	public Livro() {
		
	}
	
	private String titulo;
	private String autor;
	private int paginas;

	

		

		
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
		for(int i = 0; i < titulo.length(); i++ ) {
			if (titulo.charAt(i) =='.') {
				System.err.println("Não pode haver o caractere (.)");
				return;
			}
		}
		
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
		
		for(int i = 0; i < autor.length(); i++ ) {
			if (autor.charAt(i) =='.') {
				System.err.println("Não pode haver o caractere (.)");
				return;
				
			}}
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}

	
	}
	


