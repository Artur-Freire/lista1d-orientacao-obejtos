package EX01;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario() {}

    public Funcionario(String nome, int matricula, double salario, LocalDate dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void exibirDados(){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Data de admissão: " + dataAdmissao);
    }
}
