package seminario.teste;

import seminario.dominio.Aluno;
import seminario.dominio.Local;
import seminario.dominio.Professor;
import seminario.dominio.Seminario;

public class Seminarioteste01 {

	public static void main(String[] args) {
		Local local = new Local("Univesp");
		Aluno aluno = new Aluno("João Pedro", 19);
		Aluno[] alunos = {aluno};
		Seminario seminario = new Seminario("Programação em JAVA", alunos, local);
		Seminario[] seminarios = {seminario};
		Professor professor = new Professor("Maria", "JAVA", seminarios);
		
		aluno.setSeminario(seminario);
		seminario.setLocal(local);
		seminario.setAluno(alunos);
		professor.setSeminario(seminarios);
		
		professor.imprime();
	}

}
