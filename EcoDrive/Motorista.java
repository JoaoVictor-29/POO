package br.edu.ifnmg.aluno.jvrp;

public class Motorista {
    private long cnh;
    private String nome;
    private char categoria;
    private Veiculo veiculoAtual;

    public Motorista(String nome, char categoria){
        this.nome = nome;
        this.categoria = Character.toUpperCase(categoria);
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public long getCnh() {
        return cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCategoria(char categoria){
        this.categoria = categoria;
    }

    public char getCategoria(){
        return categoria;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }
}

