package magicgaming.model;

public class Incomum_tipo extends Produto {
 
	String autor;
	
	public Incomum_tipo(int id, int tipo, String nome, double preco, String autor) {
		
		super(id, tipo, nome, preco);
		 this.autor = autor;
	}

}
