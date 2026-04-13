package br.edu.ifnmg.aluno.jvrp;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacao {
    private int numero;
    private ArrayList<Reserva> listaReservas;
    Scanner sc = new Scanner(System.in);

    public Estacao(int numero){
        this.numero = numero;
        this.listaReservas = new ArrayList<>();
    }

    public int getNumero(){
        return numero;
    }

   public boolean adicionarReserva(Reserva r){
        if(r == null) {
            return false;
        }

        int totalHoras = 0;
        for(Reserva reserva : listaReservas){
            totalHoras += reserva.getHoras();
        }

        if(totalHoras + r.getHoras() > 10) {
            System.out.println("Limite de tempo esgotado para essa estação!");
            return false;
        }
        listaReservas.add(r);
        return true;
    }

    public void imprimirMapa(int numEstacao){
        if(listaReservas.isEmpty()){
            System.out.println("Estação vazia!");
        }else {
            System.out.println("Numero da estação: " + getNumero());
            for (Reserva reserva : listaReservas) {
                System.out.println("Usuarios reservados: " + reserva.getUsuario());
            }
        }
    }
}
