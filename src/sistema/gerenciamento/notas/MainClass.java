package sistema.gerenciamento.notas;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// implementar um objeto
		// em qual documento será implementado o que deverá ser feito em cada opção
		
		Scanner scannerOption = new Scanner(System.in);
		ã
		int option;
		
		do {
			// menu sistema
			System.out.println("Sistema de gerenciamento de notas de alunos");
			System.out.println("-------------------------------");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Atribuir notas a um aluno");
			System.out.println("3. Buscar aluno por matrícula");
			System.out.println("4. Exibir relatório de alunos");
			System.out.println("5. Sair");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("Escolha uma opção: ");
			
			option = scannerOption.nextInt();
			scannerOption.nextLine();
			
			// menu options
			switch(option) {
			case 1: 
				// turma cadastra aluno
				break;
			case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                // turma tem o metodo de buscar aluno por matricula
                break;
            case 4:
                System.out.println("");
                // turma tem o metodo de gerar relatorio
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida! Digite uma opção válida!");
                break;
			}
			
		}while(option != 5);
		
	}

}
