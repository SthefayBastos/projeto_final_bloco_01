package magicgaming.model;

public class Comum_tipo extends Produto {
		
	int ano_Edit;
	
	
	public Comum_tipo(int id, int tipo, String nome, double preco, int ano_Edit) {
		super(id, tipo, nome, preco);
		this.ano_Edit = ano_Edit;
	}

}
