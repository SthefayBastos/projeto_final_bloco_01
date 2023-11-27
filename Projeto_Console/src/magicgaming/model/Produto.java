package magicgaming.model;

	public abstract class Produto {
	
	private	int id, tipo;
	private	String nome;
	private	double preco;
	
	public Produto(int id, int tipo, String nome, double preco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	public void visualizar () {
	//comum, incomum, rara, lendária
		String tipo = "";
		switch (this.tipo) {
		case 1 -> tipo = "Comum";
			
		case 2 -> tipo = "Incomum";
		
		case 3 -> tipo = "Rara";
		
		case 4 -> tipo = "Lendária";
		}
				
		 System.out.println("************************************************");
		 System.out.println("Informações do produto                          ");
		 System.out.println("************************************************");
		 System.out.println("Código : " + this.id);
		 System.out.println("Nome " + this.nome);
		 System.out.println("Tipo : " + tipo);
		 System.out.println("Preço: " + this.preco);
		 

	 }
}
