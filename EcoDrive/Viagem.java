package br.edu.ifnmg.aluno.jvrp;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private double distancia;
    private double consumoGerado;

    public Viagem(double distancia){
        this.data = LocalDate.now();
        this.distancia = distancia;
        this.consumoGerado = distancia / 10;
    }

    public LocalDate getData(){
        return data;
    }

    public double getDistancia(){
        return distancia;
    }

    public double getConsumoGerado(){
        return consumoGerado;
    }

}
