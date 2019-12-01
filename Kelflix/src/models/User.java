package models;
public class User{
	private int senha;
	public int idade;
	private String cpf;
	public String nome;
	public String email;

	public User(int id, int senha, int idade, String cpf, String nome, String email) {
		super();
		this.senha = senha;
		this.idade = idade;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		String user;
		user = "Nome: " + nome + "\n";
		user += "CPF: " + cpf + "\n";
		user += "Email: " + email + "\n";
		user += "Idade: " + idade + "\n";
		return user;
	}

	public User() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
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

	public void setCpf(String i) {
		this.cpf = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
