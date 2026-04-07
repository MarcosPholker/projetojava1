package curso.java.marcos;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private Double telefone;
	
	
	public Pessoa(String nome, int idade, String cpf, Double telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getTelefone() {
		return telefone;
	}
	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}
	
	
}
