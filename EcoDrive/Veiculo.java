package br.edu.ifnmg.aluno.jvrp;

import java.util.ArrayList;

public class Veiculo {
    public static int CAPACIDADE_MAXIMA = 50;

    private String placa;
    private String modelo;
    private double nivelCombustivel;
    private Motorista motorista;
    private double distanciaTotalPercorrida;
    private ArrayList<Viagem> historicoViagem;

    public Veiculo(String placa, double nivelCombustivel){
        this.placa = placa;
        this.nivelCombustivel = nivelCombustivel;
        this.distanciaTotalPercorrida = 0;
        this.historicoViagem = new ArrayList<Viagem>();
    }

    //<editor-fold desc="Description">
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Motorista getMotorista() {
        return motorista;
    }
    //</editor-fold>

    public void registrarMotorista(Motorista motorista){
        if(motorista.getCategoria() != 'D'){
            System.out.println("Categoria de carteira não permitida");
            return;
        }

        if(this.motorista != null){
            System.out.println("Motorista " + this.motorista.getNome() + " desvinculado!");
            this.motorista.setVeiculoAtual(null);
        }
        this.motorista = motorista;
        System.out.println("Motorista " + motorista.getNome() + " vinculado");

    }

    public void abastecer(int litros){
        if(litros < 0){
            System.out.println("Quantidade inválida para abastecimento");
            return;
        }
        if(nivelCombustivel + litros > CAPACIDADE_MAXIMA){
            System.out.println("Quantidade ultrapassa o limite de combustivel");
        }else{
            this.nivelCombustivel += litros;
        }
    }

    //Reutilizei esse metodo, e adicionei no final no arraylist
    public void registrarViagem(double distanciaKm){
        if(this.motorista == null){
            System.out.println("Não é possivel viajar sem um motorista cadastrado!");
            return;
        }
        double gasto = distanciaKm / 10;
        if(gasto > this.nivelCombustivel){
            System.out.println("Combustivel insuficiente");
            return;
        }
        this.nivelCombustivel -= (int) gasto;
        this.distanciaTotalPercorrida += distanciaKm;

        Viagem novaViagem = new Viagem(distanciaKm);
        historicoViagem.add(novaViagem);
    }

    public void gerarRelatorioViagens(){
        double totalKm = 0;
        for(Viagem v : historicoViagem){
            System.out.println("Data: " + v.getData() + "|" + "Distancia: " + v.getDistancia());
            totalKm += v.getDistancia();
        }
        System.out.println("Total de Km: " + totalKm);
    }

    public void exibirStatus(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Nivel do Combustivel: " + this.nivelCombustivel);
        System.out.println("Distancia Percorrida: " + this.distanciaTotalPercorrida);
    }

}

