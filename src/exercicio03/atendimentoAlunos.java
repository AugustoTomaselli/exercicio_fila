package exercicio03;

import java.util.Scanner;

public class atendimentoAlunos {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Insere aluno na fila: ");
            System.out.println("Retira aluno na fila: ");
            System.out.println("Encerra atendimento: ");
            opcao = le.nextInt();
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Encerrando atendimento");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(opcao!=3);
        le.close();
    }
}
