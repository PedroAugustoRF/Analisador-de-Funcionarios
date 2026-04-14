package model.entities;

public class Funcionario {
	private String nome;
	private String email;
	private Double salario;
	
	public Funcionario(String nome, String email, Double salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append("\nEmail: " + email);
		sb.append("\nSalário: " + String.format("%.2f", salario));
		sb.append("\n------------------------------------------");
		return sb.toString();
	}
}
