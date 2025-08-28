package RPG;

public class Personagem {
	
	private String nome;
	private String classe;
	private int vida;
	private int nivel;
	
	public void Personagem() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getVida() {
		return vida;
		
		}
	

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", classe=" + classe + ", vida=" + vida + ", nivel=" + nivel + "]";
	}

	public void setVida(int vida) {
		this.vida = vida;
		while(vida < 0 || vida > 100 ) {
			System.out.println("Coloque um número entre 0 a 100");
			return;
		}	
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
		while(nivel < 1) {
			System.out.println("O nível não pode ser menor que 1!!");
			
			return;
		}
	}

	
			
			
	
	}


