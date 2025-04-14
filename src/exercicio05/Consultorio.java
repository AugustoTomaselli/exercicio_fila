package exercicio05;

import filas.filaInt;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        filaInt fila = new filaInt();
        do {
            System.out.println("1 -Insere paciente na fila ");
            System.out.println("2 -Retira paciente da fila  ");
            System.out.println("3 -Encerra atendimento  ");
            opcao = le.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Nome do paciente que chegou:");
                    le.nextLine();
                    String nome = le.nextLine();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty())
                        System.out.println("Nao ha pacientes  na fila");
                    else
                        System.out.println("Paciente a ser atendido agora " + fila.dequeue());
                        break;
                        case 3:
                            if (fila.isEmpty())
                                System.out.println("Encerrando o atendimento ");
                    else
                    System.out.println("Ainda ha pacientes aguardando na fila");
                    opcao = 0;

                    break;
                default:

                    System.out.println("Opcao invalida");
            }
        } while(opcao!=3);
        le.close();
    }
}

