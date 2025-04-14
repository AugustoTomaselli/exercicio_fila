package exercicio04;

import filas.filaInt;

import java.util.Scanner;

public class processador {
        public static void main(String[] args) {
            Scanner le = new Scanner(System.in);
            int opcao;
            filaInt fila = new filaInt();
            do {
                System.out.println("1 -Insere um proscesso na fila");
                System.out.println("2 -Executa o proscesso ");
                System.out.println("3 -Shoutdown ");
                opcao = le.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("pid:");
                        int pid = le.nextInt();
                        fila.enqueue(pid);
                        break;
                    case 2:
                        if (fila.isEmpty())
                            System.out.println("Nao ha proscessos na fila");
                        else{
                            pid = fila.dequeue();
                            System.out.println("O proscesso" + pid + "esta executando");
                            System.out.println("... o proscesso foi concluido? (1- sim):");
                            int resp = le.nextInt();
                            if (resp == 1)
                                System.out.println("Pid :" + pid + "concluido 2");
                            else {
                                fila.enqueue(pid);
                                System.out.println("Proscesso voltou para a fila");
                            }
                        }
                        break;
                    case 3:
                        if (fila.isEmpty())
                            System.out.println("Fechando o sisyema ");
                        else {
                            System.out.println("Ainda ha proscessos em execução");
                            System.out.println("Deseja encerrar todos? (1 - sim");
                            int resp = le.nextInt();
                            if (resp == 1) {
                                while (fila.isEmpty()) {
                                    System.out.println("Encerrando o proscesso:" + fila.dequeue());
                                }
                            }
                            else
                                opcao = -1;
                        }
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }
            } while(opcao!=3);
            System.out.println("Shoutdonw");
            le.close();
        }
    }

