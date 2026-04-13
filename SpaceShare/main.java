package br.edu.ifnmg.aluno.jvrp;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean escolha = true;

        ArrayList<Estacao> estacoes = new ArrayList<>();

        //inicializar algumas estações
        for(int i = 1; i <= 5; i++){
            estacoes.add(new Estacao(i));
        }

        while(escolha){
            System.out.println("""
                    ---MENU---
                    1 - Fazer reserva\s
                    2 - Imprimir mapa\s
                    3 - Sair""");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do usuario: ");
                    String usuario = sc.nextLine();
                    System.out.println("Digite o numero da estação e o tempo(horas) da reserva: ");
                    int numeroEstacao = sc.nextInt();
                    int tempoHoras = sc.nextInt();
                    if(numeroEstacao > 0 && numeroEstacao <= estacoes.size()){
                        Estacao estacao = estacoes.get(numeroEstacao - 1);
                        Reserva reservas = new Reserva(usuario, tempoHoras);
                        estacao.adicionarReserva(reservas);
                    }else{
                        System.out.println("Estação não encontrada!");
                    }
                    break;

                case 2:
                    System.out.println("Qual numero da estação deseja imprimir: ");
                    numeroEstacao = sc.nextInt();
                    if(numeroEstacao > 0 && numeroEstacao <= estacoes.size()) {
                        Estacao novaEstacao = estacoes.get(numeroEstacao - 1);
                        novaEstacao.imprimirMapa(numeroEstacao);
                    }
                    break;

                case 3:
                    escolha = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}
