package seminario.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminario;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade, Seminario[] seminario) {
		this(nome, especialidade);
		this.seminario = seminario;
	}
	
	public void imprime() {
		System.out.println("### PROFESSOR ###");
		System.out.println("Professor: "+this.nome);
		System.out.println("Especialidade: "+this.especialidade);
		System.out.println("------------------------------------");
		if(seminario == null) return;
		System.out.println("*** SEMINÁRIO ***");
		for(Seminario seminarios: seminario) {
			System.out.println("Seminário: "+seminarios.getTitulo());
			System.out.println("Local: "+seminarios.getLocal().getEndereco());
			System.out.println("------------------------------------");
			System.out.println("--- ALUNOS ---");
			if(seminarios.getAluno() == null) continue;
			for(Aluno aluno: seminarios.getAluno()) {
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("Idade: "+aluno.getIdade());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario[] seminario) {
		this.seminario = seminario;
	}
}
