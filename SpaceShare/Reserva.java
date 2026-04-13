package br.edu.ifnmg.aluno.jvrp;

public class Reserva {
    private String usuario;
    private int horas;

    public Reserva(String usuario, int horas){
        this.usuario = usuario;
        this.horas = horas;
    }

    public String getUsuario(){
        return usuario;
    }

    public int getHoras(){
        return horas;
    }


}
