package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        String nome, cpf;
        Scanner teclado;
        List<Aluno> listaAlunos;

        teclado = new Scanner(System.in);
        listaAlunos = new ArrayList<>();

        do {
            System.out.println("\n--------------");
            System.out.println("  MENU");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("0 - Sair");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("\nNome:");
                    nome = teclado.nextLine();
                    
                    while (true) {
                        System.out.println("\nCPF:");
                        cpf = teclado.nextLine();
                        if (cpf.matches("\\d{11}")) { 
                            break;
                        } else {
                            System.out.println("CPF inválido! Digite novamente.");
                        }
                    }
                    
                    Aluno aluno = new Aluno(nome, cpf);
                    listaAlunos.add(aluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de Alunos:");
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : listaAlunos) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }

        } while (opc != 0);
    }
}
