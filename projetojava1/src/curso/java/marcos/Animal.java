package curso.java.marcos;

public class Animal {
	private String nomeAnimal;
	private String cadastroAnimal;
	private int idadeAnimal;
	
	public Animal(String nomeAnimal, String cadastroAnimal, int idadeAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.cadastroAnimal = cadastroAnimal;
		this.idadeAnimal = idadeAnimal;
	}
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getCadastroAnimal() {
		return cadastroAnimal;
	}
	public void setCadastroAnimal(String cadastroAnimal) {
		this.cadastroAnimal = cadastroAnimal;
	}
	public int getIdadeAnimal() {
		return idadeAnimal;
	}
	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	
	
}
