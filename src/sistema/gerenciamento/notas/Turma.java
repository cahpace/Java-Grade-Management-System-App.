package sistema.gerenciamento.notas;
// ao implementar a interface, todos os metodos da interface devem ser implementados nessa classe

import java.util.ArrayList;
import java.util.List;

public class Turma implements Relatorio{
	// lista de alunos
	private List<Aluno> alunos = new ArrayList<>();
	// vai implementar a interface
	
	
	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		
	}
	
	@Override
	void exibirRelatorio() {
		
	}
}

/*
 Crie uma classe chamada Turma que representa uma turma de alunos.

A classe deve ter um atributo:

List<Aluno> alunos: uma lista para armazenar os alunos da turma.

Adicione os seguintes métodos:

void adicionarAluno(Aluno aluno): adiciona um aluno à turma.

void exibirRelatorio(): exibe um relatório com todos os alunos, suas notas e médias.

Aluno buscarAlunoPorMatricula(int matricula): busca um aluno na turma pelo número de matrícula.

 */