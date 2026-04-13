package br.edu.ifnmg.aluno.jvrp;

public class main{
    public static void main(String[] args) {

        Veiculo v1;
        v1 = new Veiculo("abc123", 50);
        Motorista mA;
        mA = new Motorista("Joao", 'D');
        /*Motorista mB;
        mB = new Motorista("Kaylane", 'D');*/

        v1.registrarMotorista(mA);

        v1.registrarViagem(20);
        v1.registrarViagem(50);
        v1.registrarViagem(15);
        //Teste da 4º viagem com distancia muito alta
        v1.registrarViagem(1600);

        v1.gerarRelatorioViagens();


       // v1.registrarMotorista(mB);
       // v1.registrarViagem(40);
       // v1.exibirStatus();
    }
}
