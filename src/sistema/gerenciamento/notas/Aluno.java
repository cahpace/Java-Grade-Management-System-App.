package sistema.gerenciamento.notas;

public class Aluno {
	private String nomeAluno;
	private int matriculaAluno; 
	private double[] notas;
	
	public Aluno(String nomeAluno, int matriculoAluno, double notas[]) {
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.notas = notas;
	}
	public double calcularMedia() {
		//calcula media
		double resultado;
		return resultado;
	}
	
	@Override
	public String toString() {
		String dadoAluno = "Nome: " + nomeAluno + ", Matrícula: " + matriculaAluno + ", Média: " + calcularMedia();
		return dadoAluno;
	}

}
/*
 Crie uma classe chamada Aluno com os seguintes atributos:

String nome: nome do aluno.

int matricula: número de matrícula do aluno.

double[] notas: um array para armazenar as notas do aluno (4 notas por aluno).

A classe deve ter um construtor para inicializar os atributos nome e matricula.

Adicione um método calcularMedia() que retorna a média das notas do aluno.

Adicione um método toString() que retorna uma string formatada com o nome, matrícula e média do aluno.

 */