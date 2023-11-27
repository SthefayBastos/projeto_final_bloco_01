package magicgaming.model;

public class Rara_tipo extends Produto {

	String foil;
	
	public Rara_tipo(int id, int tipo, String nome, double preco, String foil) {
		super(id, tipo, nome, preco);
		this.foil = foil;
	}

}
