package modelo;

public class Avaliacao {
    private String professor;
    private double indiceEvolucao;

    public Avaliacao(String professor, double indiceEvolucao) {
        this.professor = professor;
        this.indiceEvolucao = indiceEvolucao;
    }

    public String getProfessor() { return professor; }
    public double getIndiceEvolucao() { return indiceEvolucao; }
}