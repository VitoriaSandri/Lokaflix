package classes;

public class Dependente{
	
	private String parentesco;
	private String cpf;
	private String email;
	private String senha;	
	private String nome;
	private String sobrenome;
	
	public Dependente(String parentesco, String cpf, String email, String senha, String nome, String sobrenome) {
		this.parentesco = parentesco;
		this.setCpf(cpf);
		this.setEmail(email);
		this.setSenha(senha);
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		
	}
	
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
