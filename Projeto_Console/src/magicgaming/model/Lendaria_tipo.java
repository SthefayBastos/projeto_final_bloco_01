package magicgaming.model;

public class Lendaria_tipo extends Produto {
    
	String personagem;
		
	public Lendaria_tipo(int id, int tipo, String nome, double preco, String personagem) {
		super(id, tipo, nome, preco);
		this.personagem = personagem;
	}

}
